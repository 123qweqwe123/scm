package com.jet.scm.thirdservice.datasync.config;

import com.jet.scm.thirdservice.datasync.bdcor3.SyncDataFromBdcor3Service;
import com.jet.scm.thirdservice.datasync.bdcor3.impl.SyncDataFromBdcor3ServiceImpl;
import com.jet.scm.thirdservice.datasync.config.impl.SyncDataManager4HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Description:
 * <pre>
 *     定时任务，通过前台界面可以配置任务的执行时机
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/12 下午2:03
 */
@Configuration
@EnableScheduling
@PropertySource(value = "classpath:/schedule-crons.properties", encoding = "UTF-8")
public class ScheduleConfig implements SchedulingConfigurer {

    @Autowired
    private Environment env;

    @Bean
    public SyncDataFromBdcor3Service syncDataFromBdcor3Service() {
        return new SyncDataFromBdcor3ServiceImpl(env);
    }

    @Bean
    public ISyncDataManager syncDataManager() {
        return new SyncDataManager4HttpClient(env);
    }


    @Bean(name = "taskExecutor", destroyMethod = "shutdown")
    public Executor taskExecutor() {
        return Executors.newScheduledThreadPool(100);
    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.setScheduler(taskExecutor());
        // 是否启动数据同步服务
        boolean startSync = Boolean.parseBoolean(env.getProperty("third-service.data-sync.active", "true"));
        if (!startSync) {
            return;
        }
        // TODO: 后续能否改为动态配置
        taskRegistrar.addCronTask(() -> syncDataFromBdcor3Service().syncPipScmFrozenboxes(), env.getProperty("data-sync.bdcor3.frozenboxes"));
        taskRegistrar.addCronTask(() -> syncDataFromBdcor3Service().syncPipScmFrozentubes(), env.getProperty("data-sync.bdcor3.frozentubes"));
        taskRegistrar.addCronTask(() -> syncDataFromBdcor3Service().syncPipCommRccs(), env.getProperty("data-sync.bdcor3.rccs"));
        taskRegistrar.addCronTask(() -> syncDataFromBdcor3Service().syncPipCommLccs(), env.getProperty("data-sync.bdcor3.lccs"));
        taskRegistrar.addCronTask(() -> syncDataFromBdcor3Service().syncPipCommLccUsers(), env.getProperty("data-sync.bdcor3.lccusers"));

    }
}

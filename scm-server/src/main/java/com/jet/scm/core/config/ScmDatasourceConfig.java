package com.jet.scm.core.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.lang.invoke.MethodHandles;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/7 上午9:29
 */
//@Configuration
public class ScmDatasourceConfig {

    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    static final String SQL_SESSION_FACTORY_NAME = "sessionFactoryScm";
    static final String TX_MANAGER = "txManagerScm";
    static final String PACKAGE = "org.spring.springboot.dao.master";
    static final String MAPPER_LOCATION = "classpath:mapper/master/*.xml";


    /**
     * 配置多个数据源，
     * one 为样本转运系统数据库
     *
     * @return
     */
    @Primary
    @ConfigurationProperties("spring.datasource.druid.one")
    @Bean
    public DataSource dataSourceOne() {
        return DruidDataSourceBuilder.create().build();
    }


    @Bean(name = TX_MANAGER)
    @Primary
    public PlatformTransactionManager txManagerKm() {
        return new DataSourceTransactionManager(dataSourceOne());
    }

    @Bean(name = ScmDatasourceConfig.SQL_SESSION_FACTORY_NAME)
    @Primary
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCATION));
        sqlSessionFactoryBean.setDataSource(dataSourceOne());
        return sqlSessionFactoryBean.getObject();
    }

}

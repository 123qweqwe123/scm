package com.jet.datasync.bdcor2.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
 * Create: 17/7/11 下午4:36
 */
@Configuration
@MapperScan(basePackages = "com.jet.datasync.bdcor2", annotationClass = UseDatasourceBdcor2.class, sqlSessionFactoryRef = Bdcor2DatasourceConfig.SQL_SESSION_FACTORY_NAME)
public class Bdcor2DatasourceConfig {

    public static final String SQL_SESSION_FACTORY_NAME = "sessionFactoryBdcor2";
    public static final String TX_MANAGER = "txManagerBdcor2";
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @ConfigurationProperties("spring.datasource.druid.two")
    @Bean(name = "datasourceBdcor2")
    public DataSource dataSourceBdcor2() {
        return DruidDataSourceBuilder.create().build();
    }


    @Bean(name = TX_MANAGER)
    public PlatformTransactionManager txManagerBdcor2() {
        return new DataSourceTransactionManager(dataSourceBdcor2());
    }

    @Bean(name = Bdcor2DatasourceConfig.SQL_SESSION_FACTORY_NAME)
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mybatis/bdcor2/*.xml"));
        sqlSessionFactoryBean.setDataSource(dataSourceBdcor2());
        return sqlSessionFactoryBean.getObject();
    }

}

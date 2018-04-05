package com.jet.datasync.bdcor3.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
 * Create: 17/7/11 下午4:36
 */
@Configuration
@MapperScan(basePackages = "com.jet.datasync.bdcor3", annotationClass = UseDatasourceBdcor3.class, sqlSessionFactoryRef = Bdcor3DatasourceConfig.SQL_SESSION_FACTORY_NAME)
public class Bdcor3DatasourceConfig {

    public static final String SQL_SESSION_FACTORY_NAME = "sessionFactoryBdcor3";
    public static final String TX_MANAGER = "txManagerBdcor3";
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Primary
    @ConfigurationProperties("spring.datasource.druid.one")
    @Bean(name = "datasourceBdcor3")
    public DataSource dataSourceBdcor3() {
        return DruidDataSourceBuilder.create().build();
    }


    @Bean(name = TX_MANAGER)
    @Primary
    public PlatformTransactionManager txManagerBdcor3() {
        return new DataSourceTransactionManager(dataSourceBdcor3());
    }

    @Bean(name = Bdcor3DatasourceConfig.SQL_SESSION_FACTORY_NAME)
    @Primary
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mybatis/bdcor3/*.xml"));
        sqlSessionFactoryBean.setDataSource(dataSourceBdcor3());
        return sqlSessionFactoryBean.getObject();
    }

}

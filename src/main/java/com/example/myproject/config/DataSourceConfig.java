package com.example.myproject.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @Author: lixl
 * @Date: 2021/9/18 21:39
 * @Descrption
 */
@Configuration
@MapperScan(basePackages = "com.example.myproject.mapper")
public class DataSourceConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataSourceConfig.class);

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;
    @Value("${spring.datasource.jdbc-url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;


//    @Bean(name = "mysqlDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource dataSource() {
//        HikariDataSource  hikariConfig = new HikariDataSource();
//
//        hikariConfig.setDataSourceClassName(dataSourceProperties.getDriverClassName());
//        hikariConfig.setJdbcUrl(dataSourceProperties.getUrl());
//        hikariConfig.setUsername(dataSourceProperties.getUsername());
//        hikariConfig.setPassword(dataSourceProperties.getPassword());
//
//        LOGGER.info("step2, url ~ {}, driverclassname ~ {}, username ~ {}, passsword ~ {} ", dataSourceProperties.getUrl(), dataSourceProperties.getDriverClassName(), dataSourceProperties.getUsername(), dataSourceProperties.getPassword());
//        LOGGER.info("step2, url ~ {}, driverclassname ~ {}, username ~ {}, passsword ~ {} ", url, driverClassName, username, password);
//
//        hikariConfig.setDataSourceClassName(driverClassName);
//        hikariConfig.setJdbcUrl(url);
//        hikariConfig.setUsername(username);
//        hikariConfig.setPassword(password);
//        return new HikariDataSource();
//
//
//        HikariConfig hikariConfig=new HikariConfig();
//        hikariConfig.setJdbcUrl(url);
//        hikariConfig.setUsername(username);
//        hikariConfig.setPassword(password);
//        hikariConfig.setDriverClassName(dataSourceProperties.getDriverClassName());
//        HikariDataSource hikariDataSource = new HikariDataSource(hikariConfig);
//        return hikariDataSource;
//
//    }


//    @Bean(name = "mysqlDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DruidDataSource dataSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setUrl(dataSourceProperties.getUrl());
//        dataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
//        dataSource.setUsername(dataSourceProperties.getUsername());
//        dataSource.setPassword(dataSourceProperties.getPassword());
//        return dataSource;
//    }


    @Bean("mysqlDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }


    @Primary
    @Bean(name = "mysqlSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("mysqlDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        return sqlSessionFactoryBean.getObject();
    }



}

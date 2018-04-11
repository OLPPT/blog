package com.pro.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by oule on 2018/4/11.
 */
@Configuration
public class DataSourceConfig {
    @Bean(name = "h2datasource")
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "jdbcTemplate")
    @Autowired
    @Qualifier("h2datasource")
    public JdbcOperations jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}

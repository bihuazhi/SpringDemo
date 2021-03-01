package com.zkr.spring.configuation;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zkr.spring.configuation.jdbc.MyJdbcConfig;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class PropertyConfiguration {
	
	 @Autowired
	 Environment env;

	 @Bean
	 public MyJdbcConfig myJdbcConfig(){
		 MyJdbcConfig config = new MyJdbcConfig();
		 config.setPassword(env.getProperty("jdbc.username"));
		 config.setUsername(env.getProperty("jdbc.password"));
		 return config;
	 }
}

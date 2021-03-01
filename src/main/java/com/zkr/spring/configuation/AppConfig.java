package com.zkr.spring.configuation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@PropertySource("classpath:jdbc.properties")
public class AppConfig {
	
	@Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
          return new PropertySourcesPlaceholderConfigurer();
    }
	
	
}

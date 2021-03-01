package com.zkr.spring.configuation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

import com.zkr.spring.configuation.store.IntegerStore;
import com.zkr.spring.configuation.store.StringStore;

@Configuration
@Import(ImportConfiguration.class)
@ImportResource
public class MyConfiguration {

	
	@Bean( initMethod = "initStringStore" , destroyMethod = "desStringStore")
    public StringStore stringStore() {
        return new StringStore();
    }

    @Bean(initMethod = "initIntegerStore" , destroyMethod = "desIntegerStore")
    @Scope(value = "prototype") //beanµÄ¶àÀý
    public IntegerStore integerStore() {
        return new IntegerStore();
    }
}

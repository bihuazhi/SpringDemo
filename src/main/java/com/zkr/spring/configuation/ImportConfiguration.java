package com.zkr.spring.configuation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zkr.spring.configuation.store.HelloImport;

@Configuration
public class ImportConfiguration {
	
	
	@Bean()
	public HelloImport helloImport(){
		 return new HelloImport();
	}
}
 

package com.zkr.spring.examples;

//implements InitializingBean 
public class ExampleInitBean {
		
	
	/*@PostConstruct
	public void test() {
        // do some initialization work
		System.out.println("ExampleInitBean @PostConstruct init!");
    }*/
	
	public void init() {
        // do some initialization work
		System.out.println("ExampleInitBean global init !");
    }

	/*@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("ExampleInitBean afterPropertiesSet init!");
	}*/
	
	
    
}

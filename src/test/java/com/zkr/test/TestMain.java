package com.zkr.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
	    /*ClassPathResource res = new ClassPathResource("bean.xml");
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
	    XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
	    
	    reader.loadBeanDefinitions(res);*/
	    
	    FileSystemXmlApplicationContext fxa = new FileSystemXmlApplicationContext("bean.xml");
	    
	    //IOC容器的初始化过程 from today on  
	    //Reource资源定位  BeanDefinition的载入  IOC注册这些BeanDefinition的过程
	
	    
	
	}
}

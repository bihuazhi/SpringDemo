package com.zkr.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
	    /*ClassPathResource res = new ClassPathResource("bean.xml");
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
	    XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
	    
	    reader.loadBeanDefinitions(res);*/
	    
	    FileSystemXmlApplicationContext fxa = new FileSystemXmlApplicationContext("bean.xml");
	    
	    //IOC�����ĳ�ʼ������ from today on  
	    //Reource��Դ��λ  BeanDefinition������  IOCע����ЩBeanDefinition�Ĺ���
	
	    
	
	}
}

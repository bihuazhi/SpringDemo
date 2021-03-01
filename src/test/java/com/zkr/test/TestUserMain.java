package com.zkr.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zkr.spring.controller.UserController;
import com.zkr.spring.examples.TestBean;
import com.zkr.spring.service.PetStoreService;

public class TestUserMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		//control the fit healthy i never do hurt body 
		TestBean tb =  ac.getBean("prototypeInstance",TestBean.class);
		System.out.println(tb);
	}
}

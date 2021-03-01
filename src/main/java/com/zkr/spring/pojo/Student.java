package com.zkr.spring.pojo;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Required
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

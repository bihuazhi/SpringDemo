package com.zkr.spring.examples;



public class TestBean {
	
    private String name;
    private int age;
	 
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "TestBean [name=" + name + ", age=" + age + "]";
	}
	
	public TestBean() {
		super();
	}
	public TestBean(String name) {
		super();
		this.name = name;
	}
	public TestBean(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	} 
	
	
	
}

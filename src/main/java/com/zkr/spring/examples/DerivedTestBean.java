package com.zkr.spring.examples;

public class DerivedTestBean extends TestBean{
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public void initialize(){
	   System.out.println("initialization!");
	}
/*
	@Override
	public String toString() {
		return "DerivedTestBean [name=" + name + "]";
	}*/
	
	

	
}

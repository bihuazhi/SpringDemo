package com.zkr.spring.configuation.store;

public class IntegerStore implements Store<Integer> {
		
	public void initIntegerStore(){
		System.out.println("initIntegerStore");
	}
	
	public void desIntegerStore(){
		System.out.println("desIntegerStore");
	}
}

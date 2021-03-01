package com.zkr.spring.configuation.store;

public class StringStore  implements Store<String> {
		
	public void initStringStore(){
		 System.out.println("initStringStore");
	}
	
	public void desStringStore(){
		System.out.println("destroyStringStore");
	}
}

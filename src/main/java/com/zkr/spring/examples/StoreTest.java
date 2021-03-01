package com.zkr.spring.examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zkr.spring.configuation.store.Store;

@Component
public class StoreTest {

	@Autowired
	private Store<String> stringStore;

	@Autowired
	private Store<Integer> integerStore;
	
	@Autowired
	private List<Store<String>> list;

	public void say() {
		System.out.println(stringStore);

		System.out.println(integerStore);
		
		System.out.println(list);
	}

}

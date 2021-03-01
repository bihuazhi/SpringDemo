package com.zkr.spring.service.impl;

import org.springframework.stereotype.Component;

import com.zkr.spring.service.MovieFinder;

@Component("movieFinder")
public class MovieFinderImpl implements MovieFinder {

	@Override
	public void find() {
	   System.out.println("finder:»úÐµ¼§");
	}
	
}

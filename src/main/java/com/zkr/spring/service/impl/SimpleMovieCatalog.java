package com.zkr.spring.service.impl;

import com.zkr.spring.service.MovieCatalog;


public class SimpleMovieCatalog implements MovieCatalog {
	
	@Override
	public void movie() {
	    System.out.println("推荐电影：三体");
	}
			
}

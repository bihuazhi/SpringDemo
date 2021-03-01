package com.zkr.spring.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.zkr.spring.annotation.Genre;
import com.zkr.spring.service.MovieCatalog;

public class MovieRecommender {
	
	@Autowired
	@Genre("Action")
	private MovieCatalog actionCatalog;
	
	
	private MovieCatalog comedyCatalog;
	
	
    @Autowired
    public void prepare(@Genre("Comedy") MovieCatalog comedyCatalog) {
        this.comedyCatalog = comedyCatalog;
    }
    
    public void say(){
    	System.out.println(this.actionCatalog);
    	System.out.println(this.comedyCatalog);
    }
}

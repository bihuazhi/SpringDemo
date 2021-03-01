package com.zkr.spring.examples;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class MovieRecommender3 {

    private final String catalog; 
    private Map<String, Integer> countOfMoviesPerCatalog;
   
    public MovieRecommender3(@Value("#{systemProperties['jdbc.username'] + 'Catalog' }") String catalog,
    		 @Value("#{{'Thriller': 100, 'Comedy': 300}}") Map<String, Integer> countOfMoviesPerCatalog) {
    	
        this.catalog = catalog; 
        
        this.countOfMoviesPerCatalog = countOfMoviesPerCatalog;
    }
	
    public void say(){
    	 System.out.println(this.catalog);
    	 System.out.println(this.countOfMoviesPerCatalog);
    }
    
}

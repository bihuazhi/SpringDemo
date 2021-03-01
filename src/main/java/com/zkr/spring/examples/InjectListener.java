package com.zkr.spring.examples;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;

import com.zkr.spring.service.MovieFinder;

@Component
public class InjectListener {
		
	@Inject
	private MovieFinder movieFinder;

    @Inject
    public void setMovieFinder(@Named("movieFinder") MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }
    
    void outputMovie(){
    	movieFinder.find();
    }
    
}

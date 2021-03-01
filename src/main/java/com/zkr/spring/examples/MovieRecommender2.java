package com.zkr.spring.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zkr.spring.annotation.Format;
import com.zkr.spring.annotation.MovieQualifier;
import com.zkr.spring.service.MovieCatalog;


@Component
public class MovieRecommender2 {
	
	@Autowired
	@MovieQualifier(format = Format.VHS, genre = "Action")
	private MovieCatalog actionVhsCatalog;

	@Autowired
	@MovieQualifier(format = Format.VHS, genre = "Comedy")
	private MovieCatalog comedyVhsCatalog;

	@Autowired
	@MovieQualifier(format = Format.DVD, genre = "Action")
	private MovieCatalog actionDvdCatalog;

	@Autowired
	@MovieQualifier(format = Format.BLURAY, genre = "Comedy")
	private MovieCatalog comedyBluRayCatalog;
	
	
	public void say(){
		 System.out.println(this.actionVhsCatalog);
		 System.out.println(this.comedyVhsCatalog);
		 System.out.println(this.actionDvdCatalog);
		 System.out.println(this.comedyBluRayCatalog);
		 
	}
}

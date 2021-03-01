package com.zkr.spring.service;

import com.zkr.spring.dao.AccountDao;
import com.zkr.spring.dao.UserDao;

public class PetStoreService {
	
   private UserDao userDao;
   
   private AccountDao accountDao;
	
   public void getUserAccount(){
	   userDao.say();
	   accountDao.get();
   }
}

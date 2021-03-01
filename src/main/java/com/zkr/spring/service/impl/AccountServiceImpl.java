package com.zkr.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.zkr.spring.dao.AccountDao;
import com.zkr.spring.dao.UserDao;
import com.zkr.spring.service.AccountService;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	
	private UserDao userDao;
	
	@Autowired
	public AccountServiceImpl(AccountDao accountDao , UserDao userDao){
		this.accountDao = accountDao;
		this.userDao = userDao;
	} 
	
/*	@Autowired
	public void setAccountDao(AccountDao accountDao){
		   this.accountDao = accountDao;
	}*/
	
	

	@Override
	public void set() {
		accountDao.get();
		userDao.say();
	}

}

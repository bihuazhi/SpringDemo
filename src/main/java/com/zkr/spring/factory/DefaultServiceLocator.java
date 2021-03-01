package com.zkr.spring.factory;

import com.zkr.spring.service.UserService;
import com.zkr.spring.service.impl.UserServiceImpl;

public class DefaultServiceLocator {
	
	public DefaultServiceLocator(){};

    private static UserService userService = new UserServiceImpl();

    public UserService createClientServiceInstance() {
        return userService;
    }
}

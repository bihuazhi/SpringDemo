package com.zkr.spring.service.impl;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.zkr.spring.service.BeanInterface;

@Order(2)
@Component
public class BeanImplOne implements BeanInterface {
	 
}

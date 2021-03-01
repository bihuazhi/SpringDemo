package com.zkr.spring.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import com.zkr.spring.service.FactoryBeanService;
import com.zkr.spring.service.impl.FactoryBeanServiceImpl;

@Component
public class FactoryBeanLearn implements FactoryBean<FactoryBeanService>{

	@Override
	public FactoryBeanService getObject() throws Exception {
		return new FactoryBeanServiceImpl();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return FactoryBeanService.class;
	}
	
	@Override
	public boolean isSingleton() {
		return true;
	}

}

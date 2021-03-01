package com.zkr.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zkr.spring.configuation.jdbc.MyJdbcConfig;

public class TestUserMain2 {
	public static void main(String[] args) throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		/*ClientService clientService = ac.getBean("clientService",ClientService.class);
		System.out.println(clientService);
		
		UserService userBean = ac.getBean("userService",UserService.class);
		userBean.saveUser();*/
		/*ComplexObject bean = ac.getBean("moreComplexObject",ComplexObject.class);
		System.out.println(bean);
		
		ExampleInitBean bean2 = ac.getBean("exampleInitBean",ExampleInitBean.class);*/
		
		/*TestBean bean = ac.getBean("inheritsWithDifferentClass",TestBean.class); 
		System.out.println(bean.toString());*/
		
		/*BasicDataSource dataSource = ac.getBean("dataSource",BasicDataSource.class);
		System.out.println(dataSource.getPassword());*/

		/*FactoryBeanService factoryBeanService = ac.getBean(FactoryBeanService.class);
		factoryBeanService.testFactoryBean();*/
		
		/*AccountService accountService = ac.getBean("accountService",AccountService.class);
		accountService.set();*/
		
		/*BeanInvoke bean = ac.getBean("beanInvoke",BeanInvoke.class);
		bean.say();*/
		
		/*MovieRecommender2 recommender = ac.getBean("movieRecommender2",MovieRecommender2.class);
		recommender.say();*/
		
		/*ApplicationContext anc = new AnnotationConfigApplicationContext(MyConfiguration.class);
		anc.getBean(requiredType)*/
		/*MovieRecommender3 m3 = ac.getBean(MovieRecommender3.class);
		m3.say();*/
		//MovieFinder bean = ac.getBean(MovieFinder.class);
		MyJdbcConfig bean = ac.getBean(MyJdbcConfig.class);
		System.out.println(bean);
	}
}

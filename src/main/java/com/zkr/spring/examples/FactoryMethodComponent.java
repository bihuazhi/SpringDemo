package com.zkr.spring.examples;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class FactoryMethodComponent {
	
	public static int i;
	
	@Bean
    @Qualifier("public")
    public TestBean publicInstance() {
        return new TestBean("publicInstance");
    }
	
    @Bean
    protected TestBean protectedInstance(
            @Qualifier("public") TestBean spouse,
            @Value("${privateInstance.age}") String country) {
        TestBean tb = new TestBean("protectedInstance", 1);
        tb.setName(spouse.getName());
        System.out.println(country);
        tb.setAge(1);
        return tb;
    }
    
    @Bean
    private TestBean privateInstance() {
        return new TestBean("privateInstance", i++);
    }

    @Bean
    public TestBean requestScopedInstance() {
        return new TestBean("requestScopedInstance", 3);
    }
    
    @Bean
    public InjectionPoint injectionPoint() {
    	InjectionPoint injectionPoint =  new InjectionPoint();
    	injectionPoint.setMember(1);
    	return injectionPoint;
    }
	
    
    @Bean 
    @Scope("prototype")
    public TestBean prototypeInstance(ExampleBean exampleBean) {
        return new TestBean("prototypeInstance for " + exampleBean.getYears() + exampleBean.getUltimateAnswer());
    }
    
}


class InjectionPoint{
	private int member;

	public int getMember() {
		return member;
	}

	public void setMember(int member) {
		this.member = member;
	}
	
	
	
}

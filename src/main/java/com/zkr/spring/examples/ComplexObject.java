package com.zkr.spring.examples;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ComplexObject {
	private Properties adminEmails;

	private List someList;

	private Map someMap;

	private Set someSet;

	public void setAdminEmails(Properties adminEmails) {
		this.adminEmails = adminEmails;
	}

	public void setSomeList(List someList) {
		this.someList = someList;
	}

	public void setSomeMap(Map someMap) {
		this.someMap = someMap;
	}

	public void setSomeSet(Set someSet) {
		this.someSet = someSet;
	}

	@Override
	public String toString() {
		return "ComplexObject [adminEmails=" + adminEmails + ", someList=" + someList + ", someMap=" + someMap
				+ ", someSet=" + someSet + "]";
	}

	
	
	
}

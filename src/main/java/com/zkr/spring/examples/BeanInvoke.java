package com.zkr.spring.examples;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


import com.zkr.spring.service.BeanInterface;

public class BeanInvoke {

	@Autowired
	private List<BeanInterface> list;

	@Autowired
	private Map<String, BeanInterface> map;

	/**
	 * @AutowiredĬ��ΪbyType�� ������������ͬ���͵�bean �����ʹ�� @Qualifierָ�������bean�ͻ��׳��쳣
	 *                      private BeanInterface beaninterface;
	 */
	@Autowired
	@Qualifier("beanImplOne")
	private BeanInterface beaninterface;

	public void say() {
		System.out.println("list...");
		if (null != list && 0 != list.size()) {
			for (BeanInterface bean : list) {
				System.out.println(bean.getClass().getName());
			}

		} else {
			System.out.println("List<BeanInterface> list is null !!!!");
		}
		System.out.println();
		System.out.println("map...");
		if (null != map && 0 != map.size()) {
			for (Map.Entry<String, BeanInterface> m : map.entrySet()) {
				System.out.println(m.getKey() + "    " + m.getValue().getClass().getName());
			}
		} else {
			System.out.println("Map<String,BeanInterface> map is null !!!!");

		}
		System.out.println("-------------------------");
		if (null != beaninterface) {
			System.out.println(beaninterface.getClass().getName());
		} else {
			System.out.println("beaninterface is null !!!");
		}
	}
}

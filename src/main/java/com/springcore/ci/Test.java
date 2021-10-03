package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public Test() {
		System.out.println("Test ...........");
	}

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
//		Person person1 = (Person) context.getBean("person1");
//		System.out.println(person1.toString());
		Addition add = (Addition) context.getBean("add");
		add.doSum();
	}

}

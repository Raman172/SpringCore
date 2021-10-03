package beansetterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/setterInjection.xml");
		Test t = (Test) ap.getBean("t");
		t.hello("Raman");
	}

}


package beanlifecyclexml;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ap = new ClassPathXmlApplicationContext("resources/beanlifecyclexml.xml");
		Test t =(Test) ap.getBean("t");
		t.inBetweenCall();
		t.inBetweenCall();
		t.destruct();
	}

}

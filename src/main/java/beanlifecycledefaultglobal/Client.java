
package beanlifecycledefaultglobal;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ap = new ClassPathXmlApplicationContext("resources/beanlifecycledefaultglobal.xml");
		Test t =(Test) ap.getBean("t");
		Test2 t2 =(Test2) ap.getBean("t2");
		t.inBetweenCall();
		t.inBetweenCall();
	}

}

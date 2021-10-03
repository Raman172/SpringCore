package factoryclassesinstance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/factoryclassesinstance.xml");
		Car c =(Car) ap.getBean("c");
		c.drive();

	}

}

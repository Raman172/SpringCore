package factoryclasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/factoryclasses.xml");
		Car c =(Car) ap.getBean("cf");
		c.drive();

	}

}

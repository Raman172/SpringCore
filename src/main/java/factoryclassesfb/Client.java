package factoryclassesfb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/factoryclassesfb.xml");
		Car c =(Car) ap.getBean("cf");
		c.drive();

	}

}

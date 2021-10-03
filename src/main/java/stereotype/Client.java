package stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("resources/stereotype.xml");
		Car c = (Car)ac.getBean(Car.class);
		c.printCarData();
		
	}

}

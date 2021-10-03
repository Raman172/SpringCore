package CarEngine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.App;

public class ClientCarEngine {

	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/carEngine.xml");
		Car c =(Car) ap.getBean("c");
		c.printCarData();
		
		
	}

}

package staticvariable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("resources/staticvariable.xml");
		Car c = (Car)ac.getBean("c");
		c.hello();
		
	}

}

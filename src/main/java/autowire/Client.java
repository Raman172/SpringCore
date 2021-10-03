package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		String files[] = new String[] {"resources/autowire.xml"};
		ApplicationContext ap = new ClassPathXmlApplicationContext(files);
		Car c = (Car) ap.getBean("c");
		c.printCarData();
		
	}

}

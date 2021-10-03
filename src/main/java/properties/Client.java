package properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/properties.xml");
		Proper props = (Proper) ap.getBean("props");
		props.printData();
	

	}

}

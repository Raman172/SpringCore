package beansJEE;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("deprecation")
public class Client {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/springcoreJEE.xml");
		ap.getBean("o"); 
		ap.getBean("o");
		ap.getBean("o");
	}

}

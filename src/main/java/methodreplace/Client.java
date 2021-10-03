package methodreplace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/methodreplace.xml");
		Bank b = (Bank) ap.getBean("b");
		System.out.println(b.getClass().getCanonicalName());
		b.deposit();
		b.withdraw();
		b.calInt();
	}

}

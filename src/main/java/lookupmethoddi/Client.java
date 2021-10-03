package lookupmethoddi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/lookupmethoddi.xml");
		System.out.println("------------------Car---------------------");
		Car c = (Car)ap.getBean("c");
		System.out.println(c.getClass().getCanonicalName());
		System.out.println(c.myCarEngine().getName());
		
		System.out.println("------------------Bus---------------------");
		Bus b = (Bus)ap.getBean("b");
		System.out.println(b.getClass().getCanonicalName());
		System.out.println(b.myBusEngine().getName());
		
		System.out.println("------------------Truck---------------------");
		Truck t = (Truck)ap.getBean("t");
		System.out.println(t.getClass().getCanonicalName());
		System.out.println(t.myTruckEngine().getName());
	}

}

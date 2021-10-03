package vectorTreeSetHashTable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/vectorTreeSetHashTable.xml");
		VectorTreeSetHashTable listSetMap = (VectorTreeSetHashTable) ap.getBean("vectorTreeSetHashTable");
		listSetMap.printData();

	}

}

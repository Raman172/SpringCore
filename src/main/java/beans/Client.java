package beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Client {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("resources/spring.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Test t =(Test) factory.getBean("t");
		t.hello();
		Test t1 =(Test) factory.getBean("t");
		Test t2 =(Test) factory.getBean("t");
		Test t3 =(Test) factory.getBean("t");
		System.out.println(t1==t2);
		System.out.println(t3==t2);
	}

}

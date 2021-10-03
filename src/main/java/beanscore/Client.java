package beanscore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Client {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("resources/springcore.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		factory.getBean("t");
		factory.getBean("t");
		factory.getBean("t");
		factory.getBean("o");
		factory.getBean("o");
		factory.getBean("o");
	}

}

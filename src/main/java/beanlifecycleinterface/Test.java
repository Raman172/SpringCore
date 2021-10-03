
package beanlifecycleinterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test implements InitializingBean,DisposableBean {
	private String modelYear;
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
		System.out.println(modelYear);
	}
	
	public Test() {
		System.out.println(modelYear);
	}
	public void destroy() throws Exception {
		System.out.println("Destroy Call");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init Call");
		
	}
	
	public void inBetweenCall() {
		System.out.println("Inbetween call");
		System.out.println("Inbetween there");
	}
	
	

}

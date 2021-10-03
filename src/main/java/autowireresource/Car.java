package autowireresource;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	@Qualifier(value="engine")
	@Resource
	// Autowiring byName is done here
	private Engine engine;
	// in case of Autowired setters and contructors are not required
	public void printCarData() {
		System.out.println("The Engine is "+engine);
		System.out.println("The Model Year is "+engine.getModelYear());
	}
}

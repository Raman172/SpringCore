package stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	private Engine engine;
	// in case of Autowired setters and contructors are not required
	public void printCarData() {
		System.out.println("The Engine is "+engine);
		System.out.println("The Model Year is "+engine.getModelYear());
	}
}

package autowireinject;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	@Qualifier(value="e1")
	@Inject
	// Autowiring byType is done here , but after @Qualifier is used then byName is done
	private Engine engine;
	// in case of Autowired setters and contructors are not required
	public void printCarData() {
		System.out.println("The Engine is "+engine);
		System.out.println("The Model Year is "+engine.getModelYear());
	}
}

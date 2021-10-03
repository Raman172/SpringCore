package CarEngine;

public class Car {
	private String carName;
	private Engine engine;
	
	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void printCarData() {
		System.out.println("The Car Name is "+carName);
		System.out.println("The Engine is "+engine);
		System.out.println("The Model Year is "+engine.getModelYear());
	}
	
	public Car() {
		System.out.println("This is Car Constructor");
	}
}

package ArrayPrimitiveObjects;

public class Car {
	String[] carNames;
	Engine[] engines;
	public void setCarNames(String[] carNames) {
		this.carNames = carNames;
	}
	public void setEngine(Engine[] engines) {
		this.engines = engines;
	}
	
	public String[] getCarNames() {
		return carNames;
	}
	public Engine[] getEngine() {
		return engines;
	}
	
	public void printCarData() {
		for (String carName : carNames) {
			System.out.println("The Car Name is "+carName);
		}
		
		for (Engine engine : engines) {
			System.out.println("The engine is "+engine.getModelYear());
		}
		
	}
}

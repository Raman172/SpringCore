package autowireresource;

public class Engine {
	private String modelYear;
	
	
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public String getModelYear() {
		return modelYear;
	}
	
	public Engine() {
		System.out.println("This is Engine Constructor");
	}

}

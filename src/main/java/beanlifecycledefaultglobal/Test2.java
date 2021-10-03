
package beanlifecycledefaultglobal;

public class Test2  {
	
	private String modelYear;
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
		System.out.println(modelYear);
	}
	
	public Test2() {
		System.out.println(modelYear);
	}
	
	public void destruct() throws Exception {
		System.out.println("Test2 Destroy Call");
		
	}
	public void initialize() throws Exception {
		System.out.println("Test2 Init Call");
		
	}
	
	public void inBetweenCall() {
		System.out.println("Inbetween call");
		System.out.println("Inbetween there");
	}
	
	

}

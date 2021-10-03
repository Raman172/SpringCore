
package beanlifecycledefaultglobal;

public class Test  {
	private String modelYear;
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
		System.out.println(modelYear);
	}
	
	public Test() {
		System.out.println(modelYear);
	}
	public void destruct() throws Exception {
		System.out.println("Destroy Call");
		
	}
	public void initialize() throws Exception {
		System.out.println("Init Call");
		
	}
	
	public void inBetweenCall() {
		System.out.println("Inbetween call");
		System.out.println("Inbetween there");
	}
	
	

}

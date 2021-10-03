package beansprivatecontructor;

public class Test {
	
	private Test() {
		System.out.println("private contructor test in bean class");
	}

	public void hello() {
		System.out.println("Hello World");
	}

}

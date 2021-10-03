package factoryclasses;

public class ClassFactory {
	public static String carName;
	public static void setCarName(String carName) {
		ClassFactory.carName = carName;
	}
	
	public static Car getInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		 Car c=(Car) Class.forName(carName).newInstance();
		 return c;
	}

}

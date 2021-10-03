package beansprivatecontructor;

import java.lang.reflect.Constructor;

@SuppressWarnings("deprecation")
public class Client {

	public static void main(String[] args) {
		try {
			Class a =Class.forName("beansprivatecontructor.Test");
			Constructor cons[] = a.getDeclaredConstructors();
			cons[0].setAccessible(true);
			cons[0].newInstance(null);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

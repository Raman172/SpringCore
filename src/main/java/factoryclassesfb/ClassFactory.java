package factoryclassesfb;

import org.springframework.beans.factory.FactoryBean;

public class ClassFactory implements FactoryBean<Object> {
	public String carName;
	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Object getObject() throws Exception {
		Car c=(Car) Class.forName(carName).newInstance();
		 return c;
	}

	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}

package methodreplace;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewCalcInterest implements MethodReplacer{

	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("Replaced method Calculate Interest");
		return obj;
	}

}

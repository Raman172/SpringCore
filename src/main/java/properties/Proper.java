package properties;

import java.util.Properties;
import java.util.Set;

public class Proper {
	
	private Properties props;
	public void setProps(Properties props) {
		this.props = props;
	}
	public Properties getProps() {
		return props;
	}
	
	public void printData() {
		Set<Object> keys =props.keySet();
		for (Object object : keys) {
			System.out.println("This is property"+object+":value "+props.getProperty((String) object));
			
		}
	}
	

}

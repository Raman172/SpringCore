package listsetmap;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListSetMap {
	
	private List fruits;
	private Set cricketers;
	private Map mpCountriesCapital;
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}
	public void setMpCountriesCapital(Map mpCountriesCapital) {
		this.mpCountriesCapital = mpCountriesCapital;
	}
	public List getFruits() {
		return fruits;
	}
	
	public Set getCricketers() {
		return cricketers;
	}
	public Map getMpCountriesCapital() {
		return mpCountriesCapital;
	}
	public void printData() {
		for(Object cric:cricketers) {
			System.out.println("cric" +cric);
		}
		for(Object fruit:fruits) {
			System.out.println("Fruits" +fruit);
		}
		for(Object key:mpCountriesCapital.keySet()) {
			System.out.println("Key " +key+ ":value"+mpCountriesCapital.get(key));
		}
		
	}
	

}

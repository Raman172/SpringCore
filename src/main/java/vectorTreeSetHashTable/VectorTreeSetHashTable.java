package vectorTreeSetHashTable;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class VectorTreeSetHashTable {
	
	private Vector fruits;
	private TreeSet cricketers;
	private Hashtable mpCountriesCapital;
	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}
	public void setCricketers(TreeSet cricketers) {
		this.cricketers = cricketers;
	}
	public void setMpCountriesCapital(Hashtable mpCountriesCapital) {
		this.mpCountriesCapital = mpCountriesCapital;
	}
	
	public void printData() {
		for(Object cric:cricketers) {
			System.out.println("cric" +cric);
		}
		for(Object fruit:fruits) {
			System.out.println("Fruits" +fruit);
		}
		for(Object key:mpCountriesCapital.keySet()) {
			System.out.println("Key " +key+ ":value "+mpCountriesCapital.get(key));
		}
		
	}
	

}

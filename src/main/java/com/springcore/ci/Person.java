package com.springcore.ci;

import java.util.Map;
import java.util.Set;

public class Person {
	private String personName;
	private int personId;
	private Set<String> tankha;
	private Map<String, String> personProps;
	private Certi certi;
	public Person(String personName, int personId, Set<String> tankha, Map<String, String> personProps, Certi certi) {
		super();
		this.personName = personName;
		this.personId = personId;
		this.tankha = tankha;
		this.personProps = personProps;
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personId=" + personId + ", Tankha=" + tankha + ", personProps="
				+ personProps + ", certi=" + certi.name+certi.values + "]";
	}
	
	
	
	
}

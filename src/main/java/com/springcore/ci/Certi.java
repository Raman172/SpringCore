package com.springcore.ci;

import java.util.List;

public class Certi {
	String name;
	List<String> values;
	public Certi(String name, List<String> values) {
		super();
		this.name = name;
		this.values = values;
	}
	@Override
	public String toString() {
		return "Certi [name=" + name + ", values=" + values + "]";
	}
}

package org.jsp.rest;

import java.util.Map;

public class Resturent {
    String name;
    String loc;
    
    Map<Integer,String>dish;

	public Resturent(String name, String loc, Map<Integer, String> dish) {
		super();
		this.name = name;
		this.loc = loc;
		this.dish = dish;
	}

	@Override
	public String toString() {
		return "Resturent [name=" + name + ", loc=" + loc + ", dish=" + dish + "]";
	}
    
    
}

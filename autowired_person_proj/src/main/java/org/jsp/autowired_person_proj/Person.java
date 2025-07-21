package org.jsp.autowired_person_proj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Autowired
	private Mobile mobile;
	
	public void use() {
		
		System.out.println("Person is using mobile");
		System.out.println(mobile);
		mobile.ring();
		}

	@Override
	public String toString() {
		return "Person [mobile=" + mobile + "]";
	}
	
}

package org.jsp.autowired_proj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PassengerDriver {
    public static void main(String[] args) {
		   
    	ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigure.class);
    	Passenger pas=context.getBean("passenger",Passenger.class);
    	pas.travel();
	}
}

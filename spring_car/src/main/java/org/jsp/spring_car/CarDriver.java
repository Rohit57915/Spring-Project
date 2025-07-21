package org.jsp.spring_car;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {
    public static void main(String[] args) {
		
    	BeanFactory factory=new ClassPathXmlApplicationContext("carConfigure.xml");
    	Car c=factory.getBean("myCar", Car.class);
    	c.start();
	}
}

package org.jsp.fieldbased;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FieldDriver {
       public static void main(String[] args) {
		 BeanFactory fact=new ClassPathXmlApplicationContext("myConfig.xml");
		  Person p=fact.getBean("person",Person.class);
		  System.out.println(p);
		 
		 
		 
	}  
	
}

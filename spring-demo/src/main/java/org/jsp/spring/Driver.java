package org.jsp.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
public static void main(String[] args) {
	BeanFactory fact=new ClassPathXmlApplicationContext("applicationContext.xml");
	Person p=fact.getBean("MyPerson",Person.class);
	System.out.println(fact);
}
}

package org.jsp.employee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDriver {
  public static void main(String[] args) {
	   
	  BeanFactory fact=new ClassPathXmlApplicationContext("myEmp.xml");
	  Employee e=fact.getBean("myEmployee",Employee.class);
	  System.out.println(e);
}
}

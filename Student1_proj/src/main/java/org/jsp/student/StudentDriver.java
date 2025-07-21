package org.jsp.student;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {
  public static void main(String[] args) {
	  
	  BeanFactory fact=new ClassPathXmlApplicationContext("myStudent.xml");
;
	  Student s=fact.getBean("myStudent",Student.class);
	  System.out.println(s);
}
}

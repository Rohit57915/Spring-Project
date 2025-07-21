package org.jsp.spring_student;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {
   public static void main(String[] args) {
	  BeanFactory factory=new ClassPathXmlApplicationContext("myConfigure.xml");
	  Student st=factory.getBean("myStudent",Student.class);
	  System.out.println(st);
	  
}
}

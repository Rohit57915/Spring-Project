package org.jsp.library_proj;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BooksDriver {
  public static void main(String[] args) {
	   
	  BeanFactory fac=new ClassPathXmlApplicationContext("myLibrary.xml");
	  
	  Library lb=fac.getBean("myBooks",Library.class);
	  System.out.println(lb);
}
}

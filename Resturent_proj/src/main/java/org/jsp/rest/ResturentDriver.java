package org.jsp.rest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResturentDriver {
  public static void main(String[] args) {
	  BeanFactory fat=new ClassPathXmlApplicationContext("myRest.xml");
	  Resturent res=fat.getBean("myResturent",Resturent.class);
		 System.out.println(res);
}
}

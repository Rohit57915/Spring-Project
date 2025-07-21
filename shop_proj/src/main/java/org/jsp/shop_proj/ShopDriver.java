package org.jsp.shop_proj;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShopDriver {
  public static void main(String[] args) {
	  
	  BeanFactory fact=new ClassPathXmlApplicationContext("myShop.xml");
	  Shop s=fact.getBean("myShopping",Shop.class);
	  System.out.println(s);
}
}

package org.jsp.autowired_qualify_proj;

import org.springframework.stereotype.Component;

@Component
public class Square implements Shape {
      public void sides()
      {
    	  System.out.println("There are 4 sides");
      }
}

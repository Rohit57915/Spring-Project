package org.jsp.autowired_qualify_proj;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShapeDriver {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigure.class);

        ShapeApp app = context.getBean("shapeApp",ShapeApp.class);
        app.display();

     //   Scanner s = context.getBean("scanner", Scanner.class);
     //   System.out.println("Scanner Bean: " + s);

     //   Student stu = context.getBean("student", Student.class);
     //   System.out.println("Student Bean: " + stu);
    }
}

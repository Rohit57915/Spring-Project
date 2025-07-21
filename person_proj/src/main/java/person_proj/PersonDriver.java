package person_proj;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDriver {
    public static void main(String[] args) {
		  
    	BeanFactory fact=new ClassPathXmlApplicationContext("myPerson.xml");
    	Person p=fact.getBean("myPerson",Person.class);
    	System.out.println(p);
    	p.use();
	}
}

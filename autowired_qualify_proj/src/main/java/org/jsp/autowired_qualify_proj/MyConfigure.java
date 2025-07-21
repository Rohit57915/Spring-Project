package org.jsp.autowired_qualify_proj;



import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.jsp.autowired_qualify_proj")
public class MyConfigure {

  /*  @Bean(name = "scanner")
    public Scanner getScanner() {
        return new Scanner(System.in);
    }

    @Bean(name = "student")
    public Student getStudent() {
        return new Student();
    }*/
}

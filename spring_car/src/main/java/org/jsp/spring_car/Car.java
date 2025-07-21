package org.jsp.spring_car;

public class Car {
     private Engine engine;
     
     public void start()
     {
    	 engine.run();
    	 System.out.println("Car is Start");
     }

	 public Engine getEngine() {
		 return engine;
	 }

	 public void setEngine(Engine engine) {
		 this.engine = engine;
	 }
     
     
}

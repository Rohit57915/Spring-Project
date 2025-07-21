package org.jsp.student;

import java.util.List;

public class Student {
   int id;
   String name;
   int age;
   List<String>teachers;
   public Student(int id, String name, int age, List<String> teachers) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.teachers = teachers;
   }
   @Override
   public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + ", teachers=" + teachers + "]";
   }
   
}

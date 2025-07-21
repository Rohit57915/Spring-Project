package org.jsp.library_proj;

import java.util.List;

public class Library {
     private int id;
     private String name;
     
     private List<String>Books;

	 public int getId() {
		 return id;
	 }

	 public void setId(int id) {
		 this.id = id;
	 }

	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public List<String> getBooks() {
		 return Books;
	 }

	 public void setBooks(List<String> books) {
		 Books = books;
	 }

	 @Override
	 public String toString() {
		return "Library [id=" + id + ", name=" + name + ", Books=" + Books + "]";
	 }

	
     
     
}

package org.jsp.shop_proj;

import java.util.Map;

public class Shop {
   private String name;
   private String loc;
   
   private Map<Integer,String>product;

   public String getName() {
	return name;
   }

   public void setName(String name) {
	this.name = name;
   }

   public String getLoc() {
	return loc;
   }

   public void setLoc(String loc) {
	this.loc = loc;
   }

   public Map<Integer, String> getProduct() {
	return product;
   }

   public void setProduct(Map<Integer, String> product) {
	this.product = product;
   }

   @Override
   public String toString() {
	return "Shop [name=" + name + ", loc=" + loc + ", product=" + product + "]";
   }

   


   
}

package com.heraizen.cj.day5.object_concept;

public class Product1 {
	int pid;
	String pname;
	double price;

	public static void main(String[] args) {
    Product1.dispalyDetails();
	}

	Product1(int pid, String pname, double price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;

	}

	int getPid(){
		return pid;
	}
   String getPname() {
	   return pname;
   }
   double getPrice() {
	   return price;
   }
   void serPid(int pid){
	this.pid=pid;
	}
  void setPname(String pname) {
	   this.pname=pname;
  }
  void setPrice(double price) {
	  this.price=price;
  }
  static Product1[] getSeedData(){
	  Product1 laptop=new Product1(100,"sony",8500);
	  Product1 desktop=new Product1(100,"sony",35000);
	  
	   
	   return new Product1[] {laptop,desktop};
   }
  static  void dispalyDetails() {
	   
	   Product1[] parr=Product1.getSeedData();
	   System.out.println("----------Product Details-----------------");
	   System.out.println("Before swaping the price");
	   System.out.format("\n%-8s%-10s%-20s\n", "ID", "Name","Price");
	  
	   for(Product1 p:parr) {
		   System.out.format("\n%-8d%-10s%-20s\n",p.getPid(),p.getPname(),p.getPrice());
	   }
	    double temp=parr[0].getPrice();
	    parr[0].setPrice(parr[1].getPrice());
	    parr[1].setPrice(temp);
	   System.out.println("----------Product Details-----------------");
	   System.out.println("After swaping the price");
	   System.out.format("\n%-8s%-10s%-20s\n", "ID", "Name","Price");
	   
	   for(Product1 p:parr) {
		   System.out.format("\n%-8d%-10s%-20s\n",p.getPid(),p.getPname(),p.getPrice());
	   }
   }
}

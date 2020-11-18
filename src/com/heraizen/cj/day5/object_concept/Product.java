package com.heraizen.cj.day5.object_concept;

public class Product {
	int pid;
	String pname;
	double price;

	public static void main(String[] args) {
    Product.dispalyDetails();
	}

	Product(int pid, String pname, double price) {
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
  static Product[] getSeedData(){
	   Product p1=new Product(1001,"Colgate", 78.0);
	   Product p2=new Product(1002,"Honey", 50.0);
	   Product p3=new Product(1003,"Tea", 100.0);
	   Product p4=new Product(1004,"Horlicks", 400.0);
	   Product p5=new Product(1005,"Bread", 20.0);
	   Product p6=new Product(1006,"Chocobar", 30.0);
	   return new Product[] {p1,p2,p3,p4,p5,p6};
   }
  static  void dispalyDetails() {
	   Product[] parr=Product.getSeedData();
	
	   System.out.println("----------Product Details-----------------");
	   System.out.format("\n%-8s%-10s%-20s\n", "ID", "Name","Price");
	   for(Product p:parr) {
		   System.out.format("\n%-8d%-10s%-20s\n", p.getPid(), p.getPname(),p.getPrice());
	   }
   }
}

package com.heraizen.cj.day7.singleton;

public class DbConnection {
	private static int  count=0;
	
   {
	  count++;	
	}

	 
  private DbConnection() {
	  
  }
 public  static  DbConnection getInstance()  {
	 if(count==0) {
	  
	  DbConnection obj=new DbConnection();
	  return obj;
	 } else {
		 throw new AlreadyDbConnectedException("You can not more than one object");
	 }
	
	 
	  
  }
  
}

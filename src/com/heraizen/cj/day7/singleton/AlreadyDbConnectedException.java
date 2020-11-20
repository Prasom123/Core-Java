package com.heraizen.cj.day7.singleton;

public class AlreadyDbConnectedException  extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   private	String message;
   AlreadyDbConnectedException(){
		this.message="Db Connection already established";
	}
	AlreadyDbConnectedException(String s){
		this.message=s;
	}
  public String toString() {
	  return this.message;
  }
}

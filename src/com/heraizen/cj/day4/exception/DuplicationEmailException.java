package com.heraizen.cj.day4.exception;

public class DuplicationEmailException extends Exception
	{
	  private static final long serialVersionUID = 1L;
	  private String message;
	  
	  public DuplicationEmailException()
	  {
	    this.message = "Employee already exists with the given email address ";
	  }
	  
	  public DuplicationEmailException(String message)
	  {
	    this.message = message;
	  }
	  
	  public String toString()
	  {
	    return "DuplicationEmailException [message=" + this.message + "]";
	  }
}

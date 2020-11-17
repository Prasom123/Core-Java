package com.heraizen.cj.day4.domain;

public class Contact {
  private int id;
  private String name;
  private String email;
  private String mobile;
  
  private Contact(ContactBuilder builder) {
	  this.id=IDGenerator.getNewId();
	  this.name=builder.name;
	  this.email=builder.email;
	  this.mobile=builder.mobile;
  }
  
  public int getId()
  {
    return this.id;
  }
  
  public void setId(int id)
  {
    this.id = id;
  }
  public String getName(){
	  return this.name;
  }
  public void setName(String name) {
	  this.name=name;
  }
  public String getEmail(){
	  return this.email;
  }
  public void setEmail(String email) {
	  this.email=email;
  }
  public String getMobileNumber(){
	  return this.mobile;
  }
  public void setMobileNumber(String mobile) {
	  this.mobile=mobile;
  }
  public static class ContactBuilder
  {
    private String name;
    private String email;
    private String mobile;

    
    public ContactBuilder withName(String name)
    {
      this.name = name;
      return this;
    }
    
    public ContactBuilder withEmail(String email)
    {
      this.email = email;
      return this;
    }
    
    public ContactBuilder withMobile(String mobile)
    {
      this.mobile = mobile;
      return this;
    }
    public Contact build()
    {
      return new Contact(this);
    }
}
}

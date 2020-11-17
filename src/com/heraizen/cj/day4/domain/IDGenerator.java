package com.heraizen.cj.day4.domain;

public abstract class IDGenerator
{
  private static int id = 1002;
  
  public static int getNewId()
  {
    return id++;
  }
}
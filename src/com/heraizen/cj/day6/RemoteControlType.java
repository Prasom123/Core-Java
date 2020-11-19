package com.heraizen.cj.day6;

public class RemoteControlType {
  public static void main(String[] args) {
	 RemoteControl obj1=new DVD();
	 RemoteControl obj2=new TVRemote();
	 
	 RemoteControl[] rarr= {obj1,obj2};
	 for(RemoteControl r:rarr) {
		 r.powerOnOff();
		 System.out.println( r.volumeUp(2));
		 System.out.println( r.volumeDown(2));
		 r.mute();
	 }
}
}
 interface RemoteControl {
boolean powerOnOff(); 
int volumeUp(int increment); 
int volumeDown(int decrement); 
void mute(); 
} 
 class DVD implements RemoteControl{
	int MAX_SOUND=0;
	int MIN_SOUND=0;
	public boolean powerOnOff() {
		 return true;
	 }
	public  int volumeUp(int increment) {
		 MAX_SOUND=increment;
		 return  MAX_SOUND++;
	 }
	 public int volumeDown(int decrement) {
		 MIN_SOUND=decrement;
		 return  MIN_SOUND--; 
	 }
	 public void mute() {
		System.out.println("Mutes sound ");
	 }
 }
 class TVRemote implements RemoteControl{
	    int MAX_SOUND=0;
		int MIN_SOUND=0;
		public boolean powerOnOff() {
			 return true;
		 }
		public  int volumeUp(int increment) {
			 MAX_SOUND=increment;
			 return  MAX_SOUND++;
		 }
		 public int volumeDown(int decrement) {
			 MIN_SOUND=decrement;
			 return  MIN_SOUND--; 
		 }
		 public void mute() {
			System.out.println("Mutes sound ");
		 }

 }

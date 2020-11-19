package com.heraizen.cj.day6;

public class InstrumentType {
	public static void main(String[] args) {
		Instrument i1=new Piano();
		  Instrument i2=new Flute();
		  Instrument i3=new Piano();
		  Instrument i4=new Flute();
		  Instrument i5=new Guitar();
		  Instrument i6=new Flute();
		  Instrument i7=new Guitar();
		  Instrument i8=new Piano();
		  Instrument i9=new Flute();  
		  Instrument[] irr= {i1,i2, i3,i4,i5,i6,i7,i8,i9};
		  for(Instrument i:irr) {
			   i.play();
	}

 }
}
interface Instrument{
  public  void play();	
}
 class Piano implements Instrument{
	@Override
	public void play() {
		System.out.println("“Piano is playing pee peee peee ” for Piano class");
	 }
 }
 class Flute implements Instrument{
		@Override
		public void play() {
			System.out.println("“Flute is playing toot toot toot toot” for Flute class");
		 }
	 }

 class Guitar implements Instrument{
		@Override
		public void play() {
			System.out.println("“Guitar is playing tin tin tin tin ” for Guitar class");
		 }
	 }

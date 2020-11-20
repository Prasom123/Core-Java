package com.heraizen.cj.day6.remotecontrol;
public class RemoteMain {

	public static void main(String[] args) {
		RemoteControl dvd = new Dvd();
		RemoteControl tv = new Tv();
		if (dvd.powerOnOff())
			System.out.println("DVD power on");
		else
			System.out.println("Dvd power off");
		if (tv.powerOnOff())
			System.out.println("TV power on");
		else
			System.out.println("Tv power off");
		System.out.println("DVD volume up: " + dvd.volumeUp(2));
		System.out.println("Tv volume up: " + tv.volumeUp(5));
		System.out.println("DVD volume down: " + dvd.volumeDown(5));
		System.out.println("Tv volume down: " + tv.volumeDown(7));
		dvd.volumeUp(2);
		tv.volumeUp(5);

	}

}
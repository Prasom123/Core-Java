package com.heraizen.cj.day6;

import java.util.concurrent.ThreadLocalRandom;

public class GameType {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			int randomNumber = ThreadLocalRandom.current().nextInt(1, 4);
			if (randomNumber == 1) {
				Game e1 = new Car();
				 e1.play();
				 e1.start();
				 e1.stop();
			} else if (randomNumber == 2) {
			  Game	 e2 = new Bike();
				 e2.play();
				 e2.start();
				 e2.stop();
			} else {
				Game e3 = new Bicycle();
				 e3.play();
				 e3.start();
				 e3.stop();
			}
		}

		
	}

}

interface Game {
	public void play();

	public abstract void start();

	void stop();
}

class Car implements Game {

	@Override
	public void play() {
		System.out.println("You are playing car game");
	}

	@Override
	public void start() {

		System.out.println("Car game is started");
	}

	@Override
	public void stop() {
		System.out.println("Car game is stoped");
	}
}

class Bike implements Game {
	@Override
	public void start() {
		System.out.println("Bike game is started");
	}

	@Override
	public void play() {
		System.out.println("You are playing Bike game");
	}

	@Override
	public void stop() {
		System.out.println("Bike game is stoped");
	}
}

class Bicycle implements Game {
	@Override
	public void start() {
		System.out.println("Bicycle game is started");
	}

	@Override
	public void play() {
		System.out.println("You are playing Bicycle game");
	}

	@Override
	public void stop() {
		System.out.println("Bicycle game is stoped");
	}

}

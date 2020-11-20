package com.heraizen.cj.day6.game;

import java.util.concurrent.ThreadLocalRandom;

public class GameType {

	public static void main(String[] args) {
		Game[] gameArr = new Game[10];
		for (int i = 0; i < 10; i++) {
			int randomNumber = ThreadLocalRandom.current().nextInt(1, 4);
			if (randomNumber == 1) {
				gameArr[i] = new Car();

			} else if (randomNumber == 2) {
				gameArr[i] = new Bike();

			} else {
				gameArr[i] = new Bicycle();
			}
		}
		for (Game game : gameArr) {

			game.start();
			game.play();
			game.stop();
			System.out.println("-------------------------------------------------");
		}

	}

}
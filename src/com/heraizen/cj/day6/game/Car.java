package com.heraizen.cj.day6.game;

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
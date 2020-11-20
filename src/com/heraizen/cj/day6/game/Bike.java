package com.heraizen.cj.day6.game;

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
package com.spring_project.first.game;

public class GameRunner {
	GameConsole game;
	public GameRunner(GameConsole game) {
		this.game=game;
	}
	public void run() {
		System.out.println("Game Running!!" + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}

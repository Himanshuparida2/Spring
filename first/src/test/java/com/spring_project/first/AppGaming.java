package com.spring_project.first;

import com.spring_project.first.game.Contra;
import com.spring_project.first.game.GameRunner;
import com.spring_project.first.game.Mario;
import com.spring_project.first.game.PacMan;

public class AppGaming {

	public static void main(String[] args) {
		var mario= new Mario();
		var pacman=new PacMan();
		var contra= new Contra();
		var gameRunner= new GameRunner(contra);
		gameRunner.run();
	}

}

package com.spring_project.first.game;

public class Mario implements GameConsole {
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Go Down");
	}
	public void left() {
		System.out.println("Reverse");
	}
	public void right() {
		System.out.println("Accelerate");
	}
}

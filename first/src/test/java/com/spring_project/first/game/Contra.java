package com.spring_project.first.game;

public class Contra implements GameConsole{
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Sit Down");
	}
	public void right() {
		System.out.println("Shoot");
	}
	public void left() {
		System.out.println("Go Left");
	}
}

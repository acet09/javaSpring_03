package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole{
	
	public void up() {
		System.out.println("eat Go up");
	}
	
	public void down() {
		System.out.println("eat Go down");
	}
	
	public void left() {
		System.out.println("eat Go left");
	}
	
	public void right() {
		System.out.println("eat Go right");
	}
	
}

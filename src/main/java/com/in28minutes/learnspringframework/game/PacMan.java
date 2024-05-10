package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class PacMan implements GamingConsole{
	@Override
	public void up() {
		System.out.println("UP");
		
	}
	
	@Override
	public void down() {
		System.out.println("Down");
		
	}
	
	@Override
	public void left() {
		System.out.println("Left");
		
	}
	
	@Override
	public void right() {
		System.out.println("Right");
		
	}

}

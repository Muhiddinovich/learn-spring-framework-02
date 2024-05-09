package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacMan;
import com.in28minutes.learnspringframework.game.SuperContra;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
//	    var game = new MarioGame();
//	    var game = new SuperContra();
	    var game = new PacMan(); // 1: Object creation
	    var gameRunner = new GameRunner(game);  
	    	// 2: Object Creation + Wiring of Dependencies
	    	// Game is a Dependency of GameRunner
	    gameRunner.run();

	}

}

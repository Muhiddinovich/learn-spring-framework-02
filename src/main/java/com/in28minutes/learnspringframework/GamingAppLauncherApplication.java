package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacMan;
import com.in28minutes.learnspringframework.game.SuperContra;


@Configuration
@ComponentScan(" com.in28minutes.learnspringframework.game")
public class GamingAppLauncherApplication {
	
//	@Bean
//	public GamingConsole game() {
//		var game = new PacMan();
//		return game;
//	}
	
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		System.out.println("Paramter" + game);
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}


	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){
			context.getBean(GamingConsole.class).up();	
			context.getBean(GameRunner.class).run();
		}

	}

}
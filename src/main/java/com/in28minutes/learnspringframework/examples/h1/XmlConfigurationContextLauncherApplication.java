package com.in28minutes.learnspringframework.examples.h1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;

//@Configuration // We are using Java configuration
//@ComponentScan
public class XmlConfigurationContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean("name"));
			
			context.getBean(GameRunner.class).run();
		}

	}

}

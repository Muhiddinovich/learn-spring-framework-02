package exercise01;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("exercise01")
public class BusinessCalculationService {
	
	@Autowired
	public BusinessCalculationService() {
		super();
		System.out.println("Dependency Injection through constructor");
	}


	public int findMax() {
		return 0;
	}
	

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(BusinessCalculationService.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} 
	}

}

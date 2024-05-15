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
		try (var context = new AnnotationConfigApplicationContext(BusinessCalculationService.class)) {			
			return Arrays.stream(context.getBean(DataService.class).retrieveData()).max().orElse(0);
		}
	}
	

	public static void main(String[] args) {
		BusinessCalculationService dataService = new BusinessCalculationService();
		System.out.println(dataService.findMax());
	}

}

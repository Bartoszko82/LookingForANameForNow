package pl.bartoszko.points.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.bartoszko.points.configuration.SpringConfiguration;

public class MainApp {

	public static void main(String[] args) {

		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
	}

}

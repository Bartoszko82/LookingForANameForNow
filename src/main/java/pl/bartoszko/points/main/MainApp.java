package pl.bartoszko.points.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {

//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

}

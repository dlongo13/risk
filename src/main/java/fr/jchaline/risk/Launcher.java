package fr.jchaline.risk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import fr.jchaline.risk.service.FactoryService;

@SpringBootApplication
public class Launcher {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Launcher.class, args);
		
		FactoryService factory = ctx.getBean(FactoryService.class);
		factory.generateData();
		
	}
}

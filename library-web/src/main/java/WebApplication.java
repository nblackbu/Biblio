package src.main.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class WebApplication {
	private static final Logger logger = LoggerFactory.getLogger(WebApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
		logger.info("MOCK SERVER WEB - CURRENT VERSION: 1.9.0");
	}
}
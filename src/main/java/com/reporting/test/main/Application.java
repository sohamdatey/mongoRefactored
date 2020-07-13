package com.reporting.test.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"com.reporting.test"})
@ComponentScan(basePackages = { "com.reporting.test.report"} )
@EnableMongoRepositories(basePackages = { "com.reporting.test.report.*"} )
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

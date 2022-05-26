package com.romeone.taskExample;

import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;


@SpringBootApplication
public class TaskExampleApplication {

	private final Logger logger = LoggerFactory.getLogger(com.romeone.taskExample.TaskExampleApplication.class);

	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(TaskExampleApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

	@EventListener(ApplicationReadyEvent.class)
	public void runAfterStartup() {
		queryAllCustomers();
		createCustomer();
		queryAllCustomers();
	}

	private void createCustomer() {
		Customer newCustomer = new Customer();
		newCustomer.setFirstName("John");
		newCustomer.setLastName("Doe");
		logger.info("Saving new customer...");
		this.repository.save(newCustomer);
	}

	private void queryAllCustomers() {
		List<Customer> allCustomers = this.repository.findAll();
		logger.info("Number of customers: " + allCustomers.size());
	}


}

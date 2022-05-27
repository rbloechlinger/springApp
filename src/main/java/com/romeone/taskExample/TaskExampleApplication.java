package com.romeone.taskExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;


@SpringBootApplication
public class TaskExampleApplication {

	private final Logger logger = LoggerFactory.getLogger(com.romeone.taskExample.TaskExampleApplication.class);

//	@Autowired
//	private UserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(TaskExampleApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}

		};
	}

	@EventListener(ApplicationReadyEvent.class)
	public void runAfterStartup() {
//		queryAllCustomers();
//		createCustomer();
//		queryAllCustomers();
	}

	private void createCustomer() {
//		User newUser = new User();
//		newUser.setFirstName("John");
//		newUser.setLastName("Doe");
//		newUser.setCreat
//		logger.info("Saving new customer...");
//		this.repository.save(newUser);
	}

	private void queryAllCustomers() {
//		List<User> allUsers = this.repository.findAll();
//		logger.info("Number of customers: " + allUsers.size());
	}
}

package com.esprit.microservice;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class JobMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobMsApplication.class, args);
	}
	@Bean
	ApplicationRunner init(JobRepository repository) {
		return (args) -> {
			// save
			repository.save(new Job("Informatique", true));
			repository.save(new Job("Telecom", false));
			repository.save(new Job("Administration", true));
			// fetch
			repository.findAll().forEach(System.out::println);

		};
	}
}

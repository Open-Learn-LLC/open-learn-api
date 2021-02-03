package com.openlearn.api;

import com.openlearn.api.dao.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@SpringBootApplication
public class OpenLearnApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenLearnApiApplication.class, args);
	}
}

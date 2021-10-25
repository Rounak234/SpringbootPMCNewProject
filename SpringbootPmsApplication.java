package com.PlacementManagementSystemUsingSpring.SpringbootPMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringbootPmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPmsApplication.class, args);
	}

}

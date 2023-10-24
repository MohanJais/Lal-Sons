package com.TransTech.LalandSons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.Transtech.LalandSons")
@EnableSwagger2
public class LalAndSonsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LalAndSonsApplication.class, args);
	}

}

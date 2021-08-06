package com.br.ProjetoCrudWildfly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ProjetoCrudWildflyApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ProjetoCrudWildflyApplication.class, args);
	}
	
	protected SpringApplicationBuilder config(SpringApplicationBuilder builder) {
		return builder.sources(getClass());
	}

}

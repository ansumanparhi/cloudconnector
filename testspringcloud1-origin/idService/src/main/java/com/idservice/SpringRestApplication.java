package com.idservice;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Sample RESTful application
 */
@SpringBootApplication(scanBasePackages = { "com.idservice" })

public class SpringRestApplication extends SpringBootServletInitializer {

	@Autowired
	private DataSource dataSource;

	// Make sure that everything for .war deployment is there
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringRestApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringRestApplication.class, args);
	}

}
package com.example.jspdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JspDemoApplication {

	// Note: The application needs to extend SpringBootServletInitializer and
	// uncomment the following
	// override if running from Tomcat web container
	//
	// @Override
	// protected SpringApplicationBuilder configure(SpringApplicationBuilder
	// application) {
	// return application.sources(JspDemoApplication.class);
	// }

	public static void main(String[] args) {
		SpringApplication.run(JspDemoApplication.class, args);
	}
}

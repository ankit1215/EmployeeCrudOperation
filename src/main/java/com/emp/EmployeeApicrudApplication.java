package com.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EmployeeApicrudApplication extends SpringBootServletInitializer{
	
	@Override  
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)   
	{  
	return application.sources(EmployeeApicrudApplication.class);  
	}   

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApicrudApplication.class, args);
	}

}

package com.websystique.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


//@EnableAutoConfiguration
//@ComponentScan("com.websystique.springboot")
@SpringBootApplication(scanBasePackages={"com.websystique.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootStandAloneWarApp extends SpringBootServletInitializer{

	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootStandAloneWarApp .class);
    }
    
    public static void main(String[] args) {
		SpringApplication.run(SpringBootStandAloneWarApp.class, args);
	}
}

package com.example.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.apache.log4j.*;

@SpringBootApplication
public class HelloWorldApplication {
	private static org.apache.log4j.Logger log = Logger.getLogger(HelloWorldApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		log.setLevel(Level.WARN);
		log.trace("Trace Message!");
		log.debug("Debug Message!");
		log.info("Info Message!");
		log.warn("Warn Message!");
		log.error("Error Message!");
		log.fatal("Fatal Message!");
	}

}

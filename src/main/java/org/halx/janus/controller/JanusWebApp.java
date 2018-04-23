package org.halx.janus.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.halx.janus.configuration")
public class JanusWebApp {
	public static void main(String[] args) {
		SpringApplication.run(JanusWebApp.class, args);
	}
}

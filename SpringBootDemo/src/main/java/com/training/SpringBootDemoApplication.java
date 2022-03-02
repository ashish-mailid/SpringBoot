package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.training.config.MyConfiguration;

@SpringBootApplication
public class SpringBootDemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Autowired
	private MyConfiguration config;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("This is a Command Line Runner");
		
		System.out.println(config.getMessage());
		System.out.println(config.getMaximum()+" "+config.getMinimum());
		
	}
	
	

}

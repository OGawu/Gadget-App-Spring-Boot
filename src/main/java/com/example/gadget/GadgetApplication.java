package com.example.gadget;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.DocumentType;

@RestController
@SpringBootApplication
public class GadgetApplication {


	public static void main(String[] args) {
		SpringApplication.run(GadgetApplication.class, args);
	}







}

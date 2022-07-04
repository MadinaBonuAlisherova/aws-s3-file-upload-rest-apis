package com.awss3demo.s3demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class S3DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(S3DemoApplication.class, args);
	}

	@RequestMapping("/hello")
	public String hello(){
		return "Hello";
	}

}

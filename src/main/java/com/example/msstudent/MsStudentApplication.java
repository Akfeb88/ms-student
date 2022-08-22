package com.example.msstudent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.netflix.discovery.AbstractDiscoveryClientOptionalArgs;

@EnableEurekaClient
@SpringBootApplication
public class MsStudentApplication {

	@Autowired
	private AbstractDiscoveryClientOptionalArgs<?> optionalArgs;
	
	public static void main(String[] args) {
		SpringApplication.run(MsStudentApplication.class, args);
	}

}

package com.jenkins.test.Jenkins.Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JenkinsTestApplication extends SpringBootServletInitializer {

	public static void main( String[] args ) {
		SpringApplication.run( JenkinsTestApplication.class, args );
	}

}

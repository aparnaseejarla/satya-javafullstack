package com.java.springframework.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.java.springframework.di.service.UserService;

@Configuration
public class AppConfiguration {

	@Bean
	@Scope("prototype")
	public UserService userService(){
		return new UserService();
	}
}

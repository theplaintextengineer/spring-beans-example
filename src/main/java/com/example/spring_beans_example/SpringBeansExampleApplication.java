package com.example.spring_beans_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring_beans_example.provider.NotificationProvider;
import com.example.spring_beans_example.service.NotificationServiceImpl;

public class SpringBeansExampleApplication {

	public static void main(String[] args) {
		var applicationContext = new AnnotationConfigApplicationContext("com.example.spring_beans_example");

		var provider = (NotificationProvider) applicationContext.getBean("consoleProvider");

		var notificationService = new NotificationServiceImpl(provider);
		notificationService.notify("Hello, Sir! You got a new message.");

		applicationContext.close();
	}

}

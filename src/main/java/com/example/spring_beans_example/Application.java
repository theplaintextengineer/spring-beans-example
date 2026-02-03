package com.example.spring_beans_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.example.spring_beans_example.service.NotificationService;

@ComponentScan("com.example.spring_beans_example")
@PropertySource("classpath:application.properties")
public class Application {
    public static void main(String[] args) {
        try (var applicationContext = new AnnotationConfigApplicationContext(Application.class)) {
            var notificationService = (NotificationService) applicationContext.getBean("notificationServiceImpl");
            notificationService.notify("Hello, Sir! You got a new message.");
        }
    }
}

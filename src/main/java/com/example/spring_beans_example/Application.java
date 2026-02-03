package com.example.spring_beans_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring_beans_example.service.NotificationService;

public class Application {
    public static void main(String[] args) {
        try (var applicationContext = new AnnotationConfigApplicationContext("com.example.spring_beans_example")) {
            var notificationService = (NotificationService) applicationContext.getBean("notificationServiceImpl");
            notificationService.notify("Hello, Sir! You got a new message.");
        }
    }
}

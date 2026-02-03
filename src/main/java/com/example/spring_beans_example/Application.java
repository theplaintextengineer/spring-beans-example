package com.example.spring_beans_example;

import com.example.spring_beans_example.provider.ConsoleProvider;
import com.example.spring_beans_example.service.NotificationServiceImpl;

public class Application {
    public static void main(String[] args) {
        var provider = new ConsoleProvider();
        var notificationService = new NotificationServiceImpl(provider);

        notificationService.notify("Hello Sir! You got a new message.");
    }
}

package com.example.spring_beans_example.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsoleProvider implements NotificationProvider {
    private final Logger log = LoggerFactory.getLogger(ConsoleProvider.class);

    @Override
    public void send(String message) {
        log.info("[Notification]: {}", message);
    }

}

package com.example.spring_beans_example.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.service.EmailFileService;
import com.example.service.EmailFileServiceImpl;

@Configuration
public class EmailConfig {
  @Bean
  @ConditionalOnProperty(
    name = "app.email.provider.enabled",
    havingValue = "true"
  )
  EmailFileService emailFileService() {
    return new EmailFileServiceImpl();
  }
}

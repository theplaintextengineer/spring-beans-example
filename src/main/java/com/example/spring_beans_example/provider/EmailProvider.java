package com.example.spring_beans_example.provider;

import java.io.IOException;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

import com.example.model.Email;
import com.example.service.EmailFileService;

@Component("emailProvider")
@ConditionalOnBean(EmailFileService.class)
public class EmailProvider implements NotificationProvider{
  private final EmailFileService emailFileService;

  public EmailProvider(EmailFileService emailFileService) {
    this.emailFileService = emailFileService;
  }

  @Override
  public void send(String message) {
  try {
    emailFileService.saveMail(new Email("admin@example.com", message));
  } catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }
  }
  
}

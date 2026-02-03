package com.example.spring_beans_example.service;

import org.springframework.stereotype.Service;

import com.example.spring_beans_example.provider.NotificationProvider;

@Service
public class NotificationServiceImpl implements NotificationService {
  private final NotificationProvider provider;

  public NotificationServiceImpl(NotificationProvider provider) {
    this.provider = provider;
  }

  @Override
  public void notify(String message) {
    provider.send(message);
  }

}

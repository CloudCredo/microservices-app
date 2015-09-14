package com.cloudcredo.microservices.training.app;

import com.cloudcredo.microservices.training.app.context.RedisContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FeedbackApplication {

  public static void main(String[] args) {
    Object[] sources = {FeedbackApplication.class, RedisContext.class};
    SpringApplication.run(sources, args);
  }
}

package com.spring.aop.springaopexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopExampleApplication
{

   public static void main(String[] args)
   {
      SpringApplication.run(SpringAopExampleApplication.class, args);
      System.out.println("started application");
   }

}

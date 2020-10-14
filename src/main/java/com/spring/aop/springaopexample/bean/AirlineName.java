package com.spring.aop.springaopexample.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AirlineName
{
   private Integer rowId;
   private String  name;
   private String  description;
   private String  airlineCode;
}

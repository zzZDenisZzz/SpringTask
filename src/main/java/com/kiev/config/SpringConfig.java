package com.kiev.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.kiev.service", "com.kiev.dao"})
public class SpringConfig {
}
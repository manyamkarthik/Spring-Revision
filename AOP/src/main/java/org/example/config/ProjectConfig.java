package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.example.services","org.example.implementation","org.example.aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {
}

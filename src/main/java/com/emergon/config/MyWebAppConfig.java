package com.emergon.config;

/*
References:
https://www.javaspringclub.com/spring-mvc-hibernate-mysql-example/

Optional:
http://www.javasavvy.com/spring-4-mvc-hibernate-jpa-java-config-tutorial/
https://howtodoinjava.com/jpa/spring-hibernate-jpa-configuration-example/   Full XML Example
 */
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.emergon")
public class MyWebAppConfig implements WebMvcConfigurer {

}

package za.co.myapplication.example.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"za.co.myapplication.example.spring.controllers", "za.co.myapplication.example.services"})
public class WebConfig {

}

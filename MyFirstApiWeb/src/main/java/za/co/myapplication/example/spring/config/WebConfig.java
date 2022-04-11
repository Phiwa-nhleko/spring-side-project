package za.co.myapplication.example.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import za.co.myapplication.example.config.BusinessConfig;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"za.co.myapplication.example.spring.controllers"})
@Import(BusinessConfig.class)
public class WebConfig {

}

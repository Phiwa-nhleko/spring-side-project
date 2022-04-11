package za.co.myapplication.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MongoConfig.class)
@ComponentScan(basePackages = {"za.co.myapplication.example.services"})
public class BusinessConfig {
}

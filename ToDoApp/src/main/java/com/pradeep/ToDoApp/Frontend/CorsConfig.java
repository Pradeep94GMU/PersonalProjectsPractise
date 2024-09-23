package com.pradeep.ToDoApp.Frontend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {


    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Allows all endpoints
                        .allowedOrigins("http://localhost:5173") // Your React frontend URL
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // Allow necessary HTTP methods
                        .allowedHeaders("*"); // Allow all headers
            }
        };
    }


}

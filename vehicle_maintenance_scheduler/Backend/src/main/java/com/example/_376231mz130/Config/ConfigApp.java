package com.example._376231mz130.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigApp {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

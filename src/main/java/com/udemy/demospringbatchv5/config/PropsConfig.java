package com.udemy.demospringbatchv5.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

@Configuration
public class PropsConfig {
    private final String PROPERTIES_LOCATION = "C:\\config\\demospringbatchv5\\application.properties";

    @Bean
    public PropertySourcesPlaceholderConfigurer config() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setLocation(new FileSystemResource(PROPERTIES_LOCATION));
        return configurer;
    }
}

package io.pelat1.jt.spring6.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProfileConfig {
    @Value("${spring.profiles.active:${spring.profiles.default:}}")
    private String profile;

    @Bean
    public String profile() {
        return profile;
    }
}

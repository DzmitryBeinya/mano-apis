package com.netcracker.auth;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.netcracker.auth")
@PropertySource("classpath:openStackAuthContext.properties")
@EnableAutoConfiguration
public class OpenStackAuthContextConfig {

}

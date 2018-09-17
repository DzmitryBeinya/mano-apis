package com.netcracker.images;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.netcracker.images")
@EnableAutoConfiguration
@PropertySource("classpath:openStackImagesContext.properties")
public class OpenStackImagesContextConfig {
}

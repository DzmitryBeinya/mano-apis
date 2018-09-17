package com.netcracker.vnfm;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.netcracker.vnfm")
@EnableAutoConfiguration
@PropertySource("classpath:vnfmContext.properties")
public class VNFMContextConfig {
}

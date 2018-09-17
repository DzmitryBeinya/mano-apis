package com.netcracker.ctx2;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.netcracker.ctx2")
@EnableAutoConfiguration
@PropertySource("classpath:openStackKeyPairsContext.properties")
public class OpenStackKeyPairsContextConfig {

}

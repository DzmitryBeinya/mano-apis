package com.netcracker.keypairs;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.netcracker.keypairs")
@EnableAutoConfiguration
@PropertySource("classpath:openStackKeyPairsContext.properties")
public class OpenStackKeyPairsContextConfig {

}

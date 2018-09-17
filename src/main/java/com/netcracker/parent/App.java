package com.netcracker.parent;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.netcracker.auth.OpenStackAuthContextConfig;
import com.netcracker.ctx2.OpenStackKeyPairsContextConfig;

public class App {
    public static void main(String[] args) {
        new SpringApplicationBuilder().parent(ParentConfig.class)
            .web(WebApplicationType.NONE)
            .child(OpenStackAuthContextConfig.class)
            .web(WebApplicationType.SERVLET)
            .sibling(OpenStackKeyPairsContextConfig.class)
            .web(WebApplicationType.SERVLET)
            .run(args);
    }
}

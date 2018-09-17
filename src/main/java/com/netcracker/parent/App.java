package com.netcracker.parent;

import com.netcracker.images.OpenStackImagesContextConfig;
import com.netcracker.vnfm.VNFMContextConfig;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.netcracker.auth.OpenStackAuthContextConfig;
import com.netcracker.keypairs.OpenStackKeyPairsContextConfig;

public class App {
    public static void main(String[] args) {
        new SpringApplicationBuilder().parent(ParentConfig.class)
            .web(WebApplicationType.NONE)
            .child(OpenStackAuthContextConfig.class)
            .web(WebApplicationType.SERVLET)
           // .sibling(OpenStackKeyPairsContextConfig.class)
             //   .web(WebApplicationType.SERVLET)
                .sibling(OpenStackImagesContextConfig.class)
                .web(WebApplicationType.SERVLET)
          //      .sibling(VNFMContextConfig.class)
                .web(WebApplicationType.SERVLET)
            .run(args);
    }
}

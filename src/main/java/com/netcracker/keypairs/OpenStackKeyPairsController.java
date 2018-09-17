package com.netcracker.keypairs;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class OpenStackKeyPairsController {

    @GetMapping(value = "/v2.1/os-keypairs", produces = "application/json")
    public String getOsKeyPairs() throws IOException {
        File file = new ClassPathResource("responses/openstack-keypairs-get.json").getFile();
        return new String(Files.readAllBytes(Paths.get(file.getPath())));
    }

    @PostMapping(value = "/v2.1/os-keypairs", produces = "application/json")
    public String postOsKeyPairs() throws IOException {
        File file = new ClassPathResource("responses/openstack-keypairs-post.json").getFile();
        return new String(Files.readAllBytes(Paths.get(file.getPath())));
    }

    @GetMapping(value = "/v2.1/flavors", produces = "application/json")
    public String getFlavors() throws IOException {
        File file = new ClassPathResource("responses/openstack-flavors.json").getFile();
        return new String(Files.readAllBytes(Paths.get(file.getPath())));
    }

    @GetMapping(value = "/v2.1/flavors/detail", produces = "application/json")
    public String getFlavorsDetail() throws IOException {
        File file = new ClassPathResource("responses/openstack-flavors-detail.json").getFile();
        return new String(Files.readAllBytes(Paths.get(file.getPath())));
    }

}

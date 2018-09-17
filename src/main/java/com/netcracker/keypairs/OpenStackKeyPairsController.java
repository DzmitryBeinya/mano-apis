package com.netcracker.keypairs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class OpenStackKeyPairsController {

    @GetMapping(value = "/v2.1/os-keypairs", produces = "application/json")
    public String getOsKeyPairs() throws IOException {
        return new String(Files.readAllBytes(Paths.get("responses/openstack-keypairs-get.json")));
    }

    @PostMapping(value = "/v2.1/os-keypairs", produces = "application/json")
    public String postOsKeyPairs() throws IOException {
        return new String(Files.readAllBytes(Paths.get("responses/openstack-keypairs-post.json")));
    }

    @GetMapping(value = "/v2.1/flavors", produces = "application/json")
    public String getFlavors() throws IOException {
        return new String(Files.readAllBytes(Paths.get("responses/openstack-flavors.json")));
    }

    @GetMapping(value = "/v2.1/flavors/detail", produces = "application/json")
    public String getFlavorsDetail() throws IOException {
        return new String(Files.readAllBytes(Paths.get("responses/openstack-flavors-detail.json")));
    }

}

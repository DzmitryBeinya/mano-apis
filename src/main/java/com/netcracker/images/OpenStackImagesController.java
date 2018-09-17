package com.netcracker.images;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class OpenStackImagesController {

    @GetMapping(value = "/v2/images", produces = "application/json")
    public String getImages() throws IOException {
        return new String(Files.readAllBytes(Paths.get("responses/openstack-images-get.json")));
    }

    @GetMapping(value = "/v2/schemas/image", produces = "application/json")
    public String getSchemas() throws IOException {
        return new String(Files.readAllBytes(Paths.get("responses/openstack-schemas-images-get.json")));
    }
}

package com.netcracker.images;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class OpenStackImagesController {

    @GetMapping(value = "/v2/images", produces = "application/json")
    public String getImages() throws IOException {
        File file = new ClassPathResource("responses/openstack-images-get.json").getFile();
        return new String(Files.readAllBytes(Paths.get(file.getPath())));
    }

    @GetMapping(value = "/v2/schemas/image", produces = "application/json")
    public String getSchemas() throws IOException {
        File file = new ClassPathResource("responses/openstack-schemas-images-get.json").getFile();
        return new String(Files.readAllBytes(Paths.get(file.getPath())));
    }
}

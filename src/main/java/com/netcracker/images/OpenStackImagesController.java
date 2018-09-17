package com.netcracker.images;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenStackImagesController {

    @GetMapping(value = "/v2/images", produces = "application/json")
    public String getImages() {
        return "222";
    }
}

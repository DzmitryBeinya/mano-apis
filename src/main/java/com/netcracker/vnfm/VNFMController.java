package com.netcracker.vnfm;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class VNFMController {

    @GetMapping(value = "/vnfm/vnflcm/v1/vnf_instances", produces = "application/json")
    public ResponseEntity<String> getInstances() throws IOException {

        return new ResponseEntity<>(new String(Files.readAllBytes(Paths.get("responses/vnfm-get.json"))), HttpStatus.OK);
    }

    @PostMapping(value = "/vnfm/vnflcm/v1/vnf_instances", produces = "application/json")
    public ResponseEntity<String> postInstances() throws IOException {

        return new ResponseEntity<>(new String(Files.readAllBytes(Paths.get("responses/vnfm-post.json"))), HttpStatus.CREATED);
    }
}

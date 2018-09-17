package com.netcracker.vnfm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VNFMController {

    @GetMapping(value = "/vnfm/vnflcm/v1/vnf_instances", produces = "application/json")
    public String getInstances() {

        return "111";
    }
}

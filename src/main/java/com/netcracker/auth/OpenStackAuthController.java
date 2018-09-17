package com.netcracker.auth;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Controller
@RequestMapping("/v3/auth/tokens")
public class OpenStackAuthController {

    @RequestMapping(method = RequestMethod.GET,produces = "application/json")
    @ResponseBody
    public ResponseEntity<String> getTokens() throws IOException {

        return new ResponseEntity<>(new String(Files.readAllBytes(Paths.get("responses/openstack-auth-get.json"))), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST,produces = "application/json")
    @ResponseBody
    public ResponseEntity<String> getToken() throws IOException {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("x-subject-token","gAAAAABbmxI_h7tD-cITN6D8mBvRlsB7B3ttZEWEdogQDpATpbGKGdmTTbcbSW3wIQ1_Ndvhrwnvu6Cwyt-juY-HIkgNJMX37MwbI3pszCK1pQsdxLNxuQAiW3t-1LSAxOr6Y2YJ74weS9gGEemNf805ZM8VxTAfbbjX00yxujFSzIP94e8UsVM");
        httpHeaders.set("x-openstack-request-id","req-fe7c3e1f-f750-4934-bf15-78fa6732522c");
        httpHeaders.set("vary","X-Auth-Token");
        return new ResponseEntity<>(new String(Files.readAllBytes(Paths.get("responses/openstack-auth-post.json"))), httpHeaders, HttpStatus.OK);
    }
}

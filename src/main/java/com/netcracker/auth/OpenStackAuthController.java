package com.netcracker.auth;

import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String getTokens() throws IOException {

        return new String(Files.readAllBytes(Paths.get("docs/auth.json")));
    }
}

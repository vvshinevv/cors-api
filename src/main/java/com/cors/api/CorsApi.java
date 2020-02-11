package com.cors.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorsApi {

    @RequestMapping("/api/cors")
    public String corsGetMethodApi() {
        return "abcd";
    }
}

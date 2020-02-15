package com.cors.api;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class CorsApi {

    @RequestMapping(value = "/api/cors", method = RequestMethod.GET)
    public HttpEntity<String> corsGetMethodApi(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        httpServletResponse.addHeader("Access-Control-Allow-Origin", "http://localhost:8088");
        return new HttpEntity<String>("CORS 정책 GET TEST");
    }

    @RequestMapping(value = "/api/cors", method = RequestMethod.POST)
    public HttpEntity<String> corsPostMethodApi(@RequestBody Member member) {
        return new HttpEntity<String>("CORS 정책 POST TEST");
    }
}

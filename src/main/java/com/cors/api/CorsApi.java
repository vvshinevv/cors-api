package com.cors.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class CorsApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(CorsApi.class);

    @RequestMapping(value = "/api/cors", method = RequestMethod.GET)
    public HttpEntity<String> corsGetMethodApi(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        return new HttpEntity<String>("CORS 정책 GET TEST");
    }

    @RequestMapping(value = "/api/cors", method = RequestMethod.POST)
    public HttpEntity<String> corsPostMethodApi(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, @RequestBody Member member) {
        return new HttpEntity<String>("CORS 정책 POST TEST");
    }
}

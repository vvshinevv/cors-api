package com.cors.api;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CorsFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void destroy() {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "http://localhost:8088");
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "OPTIONS");
        httpServletResponse.setHeader("Access-Control-Max-Age", "10");
        httpServletResponse.setHeader("Access-Control-Allow-Headers", "content-type");
        chain.doFilter(request, response);
    }
}

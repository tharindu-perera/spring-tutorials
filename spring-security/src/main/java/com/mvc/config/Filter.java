package com.mvc.config;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class Filter implements javax.servlet.Filter {

    @Override
    public void destroy() {
        // ...
    }

    @Override
    public void init(FilterConfig filterConfig) {
        //
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String xHeader = ((HttpServletRequest) request).getHeader("X-Auth-Token");
        System.out.println("xHeader" + xHeader);
        chain.doFilter(request, response);

    }
}
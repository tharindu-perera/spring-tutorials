package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Controller2 extends
        HandlerInterceptorAdapter {

    @Override

    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) {
        request.setAttribute("startTime", System.currentTimeMillis());
        System.out.println(">>>22222>>>>>>>");
        return true;
    }

    @GetMapping("/home2")
    public String showHomePage() {

        return "user";
    }


    @GetMapping("/exception2")
    public void thoreNullPointerException() {
        throw new NullPointerException();
    }
}

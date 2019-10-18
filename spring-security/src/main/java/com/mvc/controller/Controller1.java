package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@ControllerAdvice
public class Controller1 extends HandlerInterceptorAdapter {

    @Override

    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        request.setAttribute( "startTime", System.currentTimeMillis());
        System.out.println(">>>>>>>>>>");
        return true;
    }

    @GetMapping("/")
    public String showHomePage() {

        return "home";
    }

    @GetMapping("/meme/{name}")
    public String showNotsure(@PathVariable("name") String name) {

        if (name.equals("notsure")) {
            return "notsure";
        } else if (name.equals("instead")) {
            return "instead";
        } else {
            return "works";
        }
    }


    @RequestMapping(value = "/show-page", method = RequestMethod.GET)
    public String showPage(WebRequest request) {
        System.out.println("request>>"+request.getAttribute("startTime", RequestAttributes.SCOPE_REQUEST));
        return "user";
    }

    @GetMapping("/name")
    public String showInputName() {

        return "name";
    }

    @GetMapping("/processNameForm")
    public String processInputName(
            @RequestParam("name") String name,
            Model model) {

        String upperName = name.toUpperCase();
        model.addAttribute("upperName", upperName);

        return "name-display";
    }

    @ExceptionHandler(NullPointerException.class)
    public ModelAndView handleNullException(NullPointerException ex) {

        ModelAndView modelView = new ModelAndView("error");
        modelView.addObject("message", "Some major error has occured.");
        System.out.println(ex.getMessage());

        return modelView;
    }

    @GetMapping("/exception")
    public void thoreNullPointerException() {
        throw new NullPointerException();
    }
}

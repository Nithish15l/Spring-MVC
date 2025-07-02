package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class TestController1 {

    @GetMapping("/home")
    public String showHome(){
        return "home";
    }

    @GetMapping("/response")
    public void showResponse(Map<String, Object> model){
        String []bookNames = new String[] {"After","Think Out of the Box","Ramayan"};
        model.put("books", bookNames);
    }
}

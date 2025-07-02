package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class QueryParamController {

    @GetMapping("/getMessage")
    public String queryMessage(String name, @RequestParam("course") String sub, Map<String, Object> model){
        String notes = "Hello " + name + " Thanks for opting " + sub;
        model.put("message",notes);
        return "query";
    }
}

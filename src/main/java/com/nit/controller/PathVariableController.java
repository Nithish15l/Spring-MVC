package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@Controller
public class PathVariableController {

    @GetMapping("/homepath/{name}/{subject}")
    public String passMessage(@PathVariable("name") String name, @PathVariable("subject") String subject, Map<String, Object> model){
        String message = "Hello " + name + " Thanks for choosing " + subject;
        model.put("message", message);
        return "path";
    }
}

package com.nit.controller;

import com.nit.pojo.Course;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class CourseController {

    @GetMapping("/coursedetails")
    public String getCourseDetails(Map<String,Object> model){
        model.put("cid", "T1");
        model.put("cname","Spring MVC");
        model.put("cprice", "199 INR");
        return "course";
    }

    @GetMapping({"/courseinfo","/course","/courseDesc"})
    public String getCourseInfo(Map<String,Object> model){
        Course c = new Course();
        c.setCourseId((1));
        c.setCourseName("Dev Ops");
        c.setCoursePrice(899.0);
        c.setCourseDuration("3 months");
        model.put("course",c);
        return "courseinfo";
    }

}

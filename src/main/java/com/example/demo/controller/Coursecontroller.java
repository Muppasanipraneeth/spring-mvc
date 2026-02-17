package com.example.demo.controller;

import com.example.demo.model.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Coursecontroller {
    @GetMapping("/courseInfo")
    public String getCourseInfo(Model model){
        model.addAttribute("id",1);
        model.addAttribute("courseName","JAVA");
        model.addAttribute("price",56800.0);
       return "course";
    }

    @GetMapping("/courseDetails")
    public String getCourseDetails(Model model){
        Course course = new Course();
        course.setId(1);
        course.setCourseName("Devops");
        course.setPrice(56800.0);
       model.addAttribute("course",course);
        return "courseInfo";
    }

}

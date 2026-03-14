package com.kodewala.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    // Show Registration Form
    @RequestMapping("/register")
    public String showRegistrationForm() {
        return "studentForm";
    }

    // Form Submission Logic
    @RequestMapping("/submitDetails")
    public ModelAndView registerStudent(
            @RequestParam("studentName") String studentName,
            @RequestParam("course") String course) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");

        String message = "Student " + studentName + " is registered for " + course + ".";

        mv.addObject("message", message);

        return mv;
    }
}

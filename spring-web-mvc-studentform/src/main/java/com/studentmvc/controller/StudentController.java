package com.studentmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.studentmvc.bean.StudentProfile;

@Controller
public class StudentController {

    @RequestMapping("/")
    public String showForm(Model model) {
        model.addAttribute("student", new StudentProfile());
        return "student-form";
    }

    @RequestMapping("/studentForm")
    public String openStudentForm(Model model) {
        model.addAttribute("student", new StudentProfile());
        return "student-form";
    }

    @RequestMapping("/submitForm")
    public String submitForm(@ModelAttribute("student") StudentProfile student) {
        return "student-success";
    }
}

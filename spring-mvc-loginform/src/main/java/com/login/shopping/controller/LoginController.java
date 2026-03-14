package com.login.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping("/showLogin")
    public ModelAndView showLogin() {
        return new ModelAndView("login");
    }

    @RequestMapping("/doLogin")
    public ModelAndView doLogin(
            @RequestParam("uname") String uname,
            @RequestParam("pass") String pass) {

        ModelAndView mv = new ModelAndView();

        if (uname.equals("admin") && pass.equals("123")) {
            mv.setViewName("shoppingHome");
            mv.addObject("username", uname);
        } else {
            mv.setViewName("error");
            mv.addObject("msg", "Invalid Username or Password!");
        }

        return mv;
    }
}

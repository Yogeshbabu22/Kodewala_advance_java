package com.kodewala.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
	@RequestMapping("/calculator")
	public String showCalculatorPage() {
		return "calculatorForm";
	}
	
	 @RequestMapping("/calculate")
	    public ModelAndView calculate(
	            @RequestParam("num1") double num1,
	            @RequestParam("num2") double num2,
	            @RequestParam("operation") String operation) {

	        double result = 0;

	        switch (operation) {
	            case "add":
	                result = num1 + num2;
	                break;
	            case "sub":
	                result = num1 - num2;
	                break;
	            case "mul":
	                result = num1 * num2;
	                break;
	            case "div":
	                result = num1 / num2;
	                break;
	        }
	        
	        ModelAndView mv = new ModelAndView("result");
	        mv.addObject("result", result);

	        return mv;
	 }
}

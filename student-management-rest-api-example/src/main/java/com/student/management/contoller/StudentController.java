package com.student.management.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.management.dto.StudentDTO;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public StudentDTO getStudent() {
		return new StudentDTO();
	}

}

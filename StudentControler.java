package com.PlacementManagementSystemUsingSpring.SpringbootPMS.Controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.PlacementManagementSystemUsingSpring.SpringbootPMS.Model.Student;
import com.PlacementManagementSystemUsingSpring.SpringbootPMS.Services.StudentService;

public class StudentControler {
	@Autowired
	StudentService userService;

}
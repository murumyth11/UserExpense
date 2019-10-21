package com.exp.expense.api;

import javax.validation.groups.ConvertGroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exp.expense.model.UserRegistration;
import com.exp.expense.service.UserService;

@RestController
public class HomeController {
	@Autowired
	UserService userservice;

	@RequestMapping("/home")
	public String home()

	{
		return "home";
	}
	
	@GetMapping("/saveuser")
	public String saveUser(@RequestParam String username,@RequestParam String password)
	{
		UserRegistration userregistration=new UserRegistration();
		userservice.saveUser(userregistration);
		return "usersaved";
	}

}



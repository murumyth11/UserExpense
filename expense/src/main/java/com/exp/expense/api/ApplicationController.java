package com.exp.expense.api;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.exp.expense.model.UserRegistration;
import com.exp.expense.service.UserService;

@RestController
public class ApplicationController {
	@Autowired
	UserService userservice;

	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}

	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("userregistration") UserRegistration userregistration)

	{
		userservice.saveUser(userregistration);
		ModelAndView mv = new ModelAndView("success");
		return mv;
	}

	@RequestMapping(value = "/show")
	public ModelAndView index1(ModelMap modelMap) {
		List<UserRegistration> userregistration = userservice.findall();

		modelMap.put("users", userservice.findall());
		ModelAndView mv = new ModelAndView("showuser");
		return mv;
	}

}

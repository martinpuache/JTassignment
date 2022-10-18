package com.training.springmvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.springmvc.model.User;
import com.training.springmvc.service.UserService;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	UserService service;
	
	
	@RequestMapping(value= "login", method=RequestMethod.GET)
	public String login() {
		System.out.println("login page");
		return "login";
	}
	
	@RequestMapping(value= "loginSuccess", method=RequestMethod.POST)
	public String loginSuccess(ModelMap map, @RequestParam String uname) {
		System.out.println("Welcome " + uname);
		map.addAttribute("username",uname);
		
		User user = new User();
		String userName = uname;
		user.setUserName(userName);
		
		service.save(user);
		map.addAttribute("userText", "User data saved!");
		
		return "loginSuccess";
	}
	
	@RequestMapping(value = "deletedUser", method=RequestMethod.POST)
	public String deleteUser() {
		
		service.deleteUser(21);
		return "deletedUser";
		
	}
	
}

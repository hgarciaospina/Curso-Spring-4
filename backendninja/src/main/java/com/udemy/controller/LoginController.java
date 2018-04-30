package com.udemy.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory; 

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.udemy.constant.ViewConstant;
import com.udemy.model.UserCredential;

@Controller
public class LoginController {
	
	private static final Log LOGGER =  LogFactory.getLog(LoginController.class);
	
	@GetMapping("/")
	public String redirectToLogin() {
		LOGGER.info("METHOD: redirectToLogin()");
		return "redirect:/login";
		
	}
	
	@GetMapping("/login")
	public String showLoginForm(Model model,
			@RequestParam(name="error", required=false) String error,
			@RequestParam(name="logout", required=false) String logout) {
		LOGGER.info("METHOD: showLoginForm() -- PARAMS: error =" + error + ", logout: " + logout);
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		model.addAttribute("userCredential", new UserCredential());
		LOGGER.info("Return to login view");
		return ViewConstant.LOGIN;
		
	}
	
	@PostMapping("/logincheck")
	public String loginCheck(@ModelAttribute(name="userCredential")  UserCredential userCredential) {
		LOGGER.info("METHOD: loginCheck() -- PARAMS: error =" + userCredential.toString());
		
		if (userCredential.getUsername().equals("user") && userCredential.getPassword().equals("user")) {
				LOGGER.info("Return to contacts view");
				return ViewConstant.CONTACTS;
		}
		LOGGER.info("Redirect to login?error");
		return "redirect:/login?error";
		
	}

}

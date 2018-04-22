package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/exampleget")
public class GetController {
	
	private static final String EXAMPLE_VIEW = "exampleget";
	
	
	//localhost:8080/exampleget/request1?nm=Henry
	//localhost:8080/exampleget/request1?nm=Alejandra
	@GetMapping("/request1")
	public ModelAndView request1(@RequestParam(name="nm", required=false, defaultValue = "Sin Definir") String name) {
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("nm_in_model", name);
		return mav;
	}
	
	//localost:8080/exampleget/request2/Henry
	//localost:8080/exampleget/request2/Alejandra
	@GetMapping("/request2/{nm}")
	public ModelAndView request2(@PathVariable("nm") String name) {
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("nm_in_model", name);
		return mav;
	}	
	
	

}
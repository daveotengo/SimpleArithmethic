package com.flutterwave.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
	
	@RequestMapping("/")
	public String showIndex() {
		
		return "index";
	}

}

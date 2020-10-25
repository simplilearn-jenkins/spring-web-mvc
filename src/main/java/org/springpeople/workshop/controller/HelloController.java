package org.springpeople.workshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	
	@RequestMapping(value="/hello")
	public String hello(Model model) {
		// delegate the request to Model
		model.addAttribute("greeting", "Welcome to Spring MVC !!!!");
		return "hello"; // logical name for a view
	}
}

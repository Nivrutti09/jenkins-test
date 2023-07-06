package com.jenkins.test.Jenkins.Test;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping( "/" )
	public String hello( Model model ) {
		model.addAttribute( "name", "Hello Jenkins" );
		return "message";
	}
}

package com.jdbcwithsecurity.jdbcwithsecurity;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeResource {

	@GetMapping("/")
	public String home() {
		return "home";
	}
	

	@GetMapping("/user")
	public String user() {
		return "user";
	}
	

	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	
}

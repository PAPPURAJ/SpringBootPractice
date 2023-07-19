package com.github.pappuraj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyControlelr {
	
	@GetMapping("/")
	@ResponseBody
	public String home() {
		return "Hello world2";
	}
}

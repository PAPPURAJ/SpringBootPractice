package com.github.pappuraj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyControlelr {
	
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Hello world";
	}
}

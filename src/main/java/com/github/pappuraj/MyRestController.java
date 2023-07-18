package com.github.pappuraj;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pappuraj.jpa.Students;

@RestController
public class MyRestController {
	
	@GetMapping("/get")
	public ArrayList<Students> loadStudent() {
		
		
		ArrayList<Students> arraylist=new ArrayList<>();
		for(int i=0;i<10;i++)
			arraylist.add(new Students("Pappuraj"+i,174110+i));
		
		
		
		
		
		return arraylist;
	}
	
	@PostMapping("/post")
	public String postStudent() {
		return "Pappuraj";
	}
	
	
}

package com.github.pappuraj;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pappuraj.jpa.MyJPA;
import com.github.pappuraj.jpa.Students;
import com.github.pappuraj.jpa.UserRepository;

@RestController
public class MyRestController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/get")
	public ArrayList<Students> loadStudent() {
		ArrayList<Students> arraylist=new ArrayList<>();
		for(int i=0;i<10;i++)
			arraylist.add(new Students("Pappuraj"+i,174110+i));
		
		
		
		
		
		return arraylist;
	}
	
	@GetMapping("/student/{id}")
	public List<Students> postStudent(@PathVariable("id") int id) {
		
		
		return userRepository.nativeQueryLoadAll(id);
	}
	
	
}

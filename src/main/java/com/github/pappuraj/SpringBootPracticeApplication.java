package com.github.pappuraj;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.github.pappuraj.jpa.Students;
import com.github.pappuraj.jpa.UserRepository;

@SpringBootApplication
public class SpringBootPracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringBootPracticeApplication.class, args);
		
		UserRepository userRepository=context.getBean(UserRepository.class);
		
		
//		//insert

		
		
		
		
		//Fetch one record
//		Optional<Students> stdOpt = userRepository.findById(1);
//		Students std=stdOpt.get();
//		System.out.println(std);
		
		
		
		
		
		
		//update
//		Optional<Students> stdOpt = userRepository.findById(1);
//		Students std=stdOpt.get();
//		std.setName("Shayeri");;
//		userRepository.save(std);
//		System.out.println(stdOpt.get());
		
		
		//Fetch all
//		Iterable<Students> findAll = userRepository.findAll();
//		findAll.forEach(student->{
//			System.out.println(student);
//		});
		
		
		
		//delete
//		userRepository.deleteById(102);;
		
		
		
	}

}

package com.github.pappuraj;

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
		
		Students student=userRepository.save(new Students("Pappuraj",174111));
		System.out.println(student);
		
	}

}

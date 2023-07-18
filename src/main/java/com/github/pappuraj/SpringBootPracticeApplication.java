package com.github.pappuraj;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.github.pappuraj.jpa.MyJPA;
import com.github.pappuraj.jpa.Students;
import com.github.pappuraj.jpa.UserRepository;

@SpringBootApplication
public class SpringBootPracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootPracticeApplication.class, args);

		MyJPA myJPA = new MyJPA(context);

		// myJPA.insert();
		// myJPA.view(0);
		//myJPA.viewAll();
		// myJPA.delete(0);
		
		
		//myJPA.findByName("PAPPURAJ");
		//myJPA.viewAllS();
		myJPA.viewAllByName("Keya");

	}

}

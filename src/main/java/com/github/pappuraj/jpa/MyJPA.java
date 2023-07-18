package com.github.pappuraj.jpa;

import java.util.Optional;

import org.springframework.context.ApplicationContext;

public class MyJPA {
	
	private UserRepository userRepository;
	
	public MyJPA(ApplicationContext context) {
		userRepository=context.getBean(UserRepository.class);
	}

	public  Students insert() {
		Students student=userRepository.save(new Students("Keya",174011));
		System.out.println(student);
		return student;
	}
	
	public void view(int id) {
		Optional<Students> stdOpt = userRepository.findById(id);
		Students std=stdOpt.get();
		System.out.println(std);
	}
	
	public void viewAll() {
		Iterable<Students> findAll = userRepository.findAll();
		findAll.forEach(student->{
			System.out.println(student);
		});
	}
	
	
	public void update() {
		Optional<Students> stdOpt = userRepository.findById(1);
		Students std=stdOpt.get();
		std.setName("Shayeri");;
		userRepository.save(std);
		System.out.println(stdOpt.get());
	}
	
	public void delete(int id) {
		userRepository.deleteById(id);;
	}

}

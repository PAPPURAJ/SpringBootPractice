package com.github.pappuraj.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class MyJPA {
	@Autowired
	private UserRepository userRepository;
	
//	public MyJPA(ApplicationContext context) {
//		userRepository=context.getBean(UserRepository.class);
//	}
	

	public  Students insert() {
		Students student=userRepository.save(new Students("Keya",174011));
		System.out.println(student);
		return student;
	}
	
	public MyJPA() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Students view(int id) {
		Optional<Students> stdOpt = userRepository.findById(id);
		Students std=stdOpt.get();
		System.out.println(std);
		return std;
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
	
	
	
	//Using finder method (Most important)
	
	public void findByName(String name) {
		List<Students> students= userRepository.findByName(name);
		for(Students st:students)
			System.out.println(st);
	}
	
	
	public void viewAllS() {
		List<Students> students= userRepository.getAllUser();
		for(Students st:students)
			System.out.println(st);
	}
	
	public void viewAllByName(String name) {
		List<Students> students= userRepository.getAllUserQ(name);
		for(Students st:students)
			System.out.println(st);
	}
	
	public void nativeQueryLoadAll(int id) {
		List<Students> students= userRepository.nativeQueryLoadAll(id);
		for(Students st:students)
			System.out.println(st);
	}
	
	
	
	

}

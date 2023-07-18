package com.github.pappuraj.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Students, Integer>{
	
	public List<Students> findByName(String name);
	
}

package com.github.pappuraj.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Students, Integer>{
	
	public List<Students> findByName(String name);
	
	//Crateing user defined customFinderMethod
	@Query("SELECT s FROM Students s")
	public List<Students> getAllUser();
	
}

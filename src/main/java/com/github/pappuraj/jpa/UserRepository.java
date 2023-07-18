package com.github.pappuraj.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<Students, Integer>{
	
	public List<Students> findByName(String name);
	
	//Crateing user defined customFinderMethod
	@Query("SELECT s FROM Students s")
	public List<Students> getAllUser();
	
	//Crateing user defined customFinderMethod with arg
	@Query("SELECT s FROM Students s WHERE s.name=:a")
	public List<Students> getAllUserQ(@Param("a") String name);
	
	//Native SQL Query
	@Query(value = "SELECT * FROM Students where id=:stdID",nativeQuery = true)
	public List<Students> nativeQueryLoadAll(@Param("stdID") int id);
	
}

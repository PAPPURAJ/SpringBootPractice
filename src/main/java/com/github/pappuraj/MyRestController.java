package com.github.pappuraj;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.github.pappuraj.jpa.MyJPA;
import com.github.pappuraj.jpa.Students;
import com.github.pappuraj.jpa.UserRepository;

@RestController
public class MyRestController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/students")
	public ResponseEntity<List<Students>> loadStudent() {
		List<Students> stdL=userRepository.getAllUser();
		return stdL.isEmpty()?ResponseEntity.status(HttpStatus.NOT_FOUND).build():ResponseEntity.of(Optional.of(stdL));
		
	}

	@GetMapping(path = "/student/{id}")
	public List<Students> postStudent(@PathVariable("id") int id) {
		return userRepository.nativeQueryLoadAll(id);
	}

	@PostMapping("/student")
	public Students postMapping(@RequestBody Students students) {
		userRepository.save(students);
		System.out.println("Student added " + students);
		return students;
	}
	
	@PutMapping("/student")
	public Students putMapping(@RequestBody Students students) {
		userRepository.save(students);
		System.out.println("Student added " + students);
		return students;
	}

	@DeleteMapping(path = "/student/delete/{id}")
	public void deleteStudent(@PathVariable("id") int id) {
		userRepository.deleteById(id);
	}
	
	@PostMapping("/upload") //For file operation
	public String upFile(@RequestParam("_file") MultipartFile file) {
		
		try {
			Files.copy(file.getInputStream(), Path.of("C:\\Users\\Hp ZBooK 15u G5\\Documents\\SpringWorkspace\\SpringBootPractice\\src\\main\\java\\resource\\"+file.getOriginalFilename()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return file.getOriginalFilename()+" Size:"+file.getSize()/1024+"KB";
	}

}

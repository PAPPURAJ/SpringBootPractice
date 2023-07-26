package com.github.pappuraj.controller;

import com.github.pappuraj.db.Student;
import com.github.pappuraj.db.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private  StudentRepository studentRepository;

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getStudent(){
        List<Student> students= Streamable.of(studentRepository.findAll()).toList();
        return ResponseEntity.ok().body(students);
    }

    @PostMapping("/student")
    public ResponseEntity saveStudent(@RequestBody Student student){
        studentRepository.save(student);
        return ResponseEntity.status(HttpStatus.OK).body(student);
    }
    @GetMapping("/student/{id}")
    public ResponseEntity getStudentById(@PathVariable("id") int id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(studentRepository.findById(id).get());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data not found");
        }
    }
}

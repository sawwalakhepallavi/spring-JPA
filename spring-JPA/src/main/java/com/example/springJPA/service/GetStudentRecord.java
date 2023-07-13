package com.example.springJPA.service;

import com.example.springJPA.model.Student;
import com.example.springJPA.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class GetStudentRecord {
   @Autowired
    private StudentRepo studentRepo;


    public List<Student> getStudents(String name) {


        return studentRepo.findByName(name);

    }

}

package com.example.springJPA;

import com.example.springJPA.repo.StudentRepo;
import com.example.springJPA.service.GetStudentRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SpringJpaApplication implements ApplicationRunner {
	@Autowired
	private GetStudentRecord getStudentRecord;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);

	}
	public void run(ApplicationArguments args) {
		System.out.println("Application is running successfully......!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		String userName = sc.nextLine();
		System.out.println(getStudentRecord.getStudents(userName));
		sc.close();
	}


}

package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public List<Student> getStudents() {
		return List.of(new Student(1L, "Mariam", "marial@mail.ru", LocalDate.of(2000, Month.JANUARY, 6), 21));
	}
}

package com.collegedemo.student;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
	
	Optional<Student> findStudentByEmail(String email);

}

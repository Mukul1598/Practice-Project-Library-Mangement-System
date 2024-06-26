package com.acciojob.Practice_Library_Management_System.Repositories;

import com.acciojob.Practice_Library_Management_System.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}

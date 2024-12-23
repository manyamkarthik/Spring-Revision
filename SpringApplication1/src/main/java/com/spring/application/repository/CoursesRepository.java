package com.spring.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.application.model.Courses;

@Repository
public interface CoursesRepository extends JpaRepository<Courses,Integer> {
    
    List<Courses> findByOrderByNameDesc();

    List<Courses> findByOrderByName();
    
}

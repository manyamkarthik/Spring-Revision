package com.spring.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.application.model.EazyClass;

@Repository
public interface EazyClassRepository extends JpaRepository<EazyClass,Integer> {
    
}

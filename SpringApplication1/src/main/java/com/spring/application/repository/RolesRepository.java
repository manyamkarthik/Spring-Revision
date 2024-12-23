package com.spring.application.repository;

import com.spring.application.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Roles,Integer> {
    Roles getByRoleName(String roleName);
}

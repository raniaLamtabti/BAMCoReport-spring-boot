package com.example.demo.repository;

import com.example.demo.entities.Role;
import com.example.demo.repository.generic.GenericRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RoleRepository extends GenericRepository<Role> {

}
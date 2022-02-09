package com.example.demo.repository;

import com.example.demo.entities.Users;
import com.example.demo.repository.generic.GenericRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface UsersRepository extends GenericRepository<Users> {
    Optional<Users> findByUsername(String username);
}
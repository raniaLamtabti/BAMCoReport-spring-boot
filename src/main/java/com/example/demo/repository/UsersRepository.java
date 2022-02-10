package com.example.demo.repository;

import com.example.demo.dto.UsersDTO;
import com.example.demo.entities.Users;
import com.example.demo.repository.generic.GenericRepository;

public interface UsersRepository extends GenericRepository<Users, UsersDTO> {

}
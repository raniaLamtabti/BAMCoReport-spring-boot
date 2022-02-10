package com.example.demo.repository;

import com.example.demo.dto.UserMembershipDTO;
import com.example.demo.entities.UserMembership;
import com.example.demo.repository.generic.GenericRepository;

public interface UserMembershipRepository extends GenericRepository<UserMembership, UserMembershipDTO> {

}
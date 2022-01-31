package com.example.bamcoreport.repository;

import com.example.bamcoreport.entities.UserMembership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMembershipRepository extends JpaRepository<UserMembership, Long> {



    List<UserMembership> findAllBy();

}

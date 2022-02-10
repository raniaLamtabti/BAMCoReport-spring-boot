package com.example.demo.service.impl;


import com.example.demo.dto.UserMembershipDTO;
import com.example.demo.entities.UserMembership;
import com.example.demo.repository.generic.GenericRepository;
import com.example.demo.service.generic.ServiceGenericImpl;
import org.springframework.stereotype.Service;

@Service
public class UserMembershipService extends ServiceGenericImpl<UserMembership,UserMembershipDTO>  {



    private static final Class<UserMembership> entityClass = UserMembership.class;
    private static final Class<UserMembershipDTO> dtoClass = UserMembershipDTO.class;
    public UserMembershipService(GenericRepository<UserMembership, UserMembershipDTO> genericRepository) {
        super( entityClass, dtoClass);
    }

}

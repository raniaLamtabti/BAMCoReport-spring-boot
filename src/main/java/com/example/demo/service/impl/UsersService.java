package com.example.demo.service.impl;


import com.example.demo.dto.UsersDTO;
import com.example.demo.entities.Users;
import com.example.demo.repository.generic.GenericRepository;
import com.example.demo.service.generic.ServiceGenericImpl;
import org.springframework.stereotype.Service;

@Service
public class UsersService extends ServiceGenericImpl<Users, UsersDTO>  {


    private static final Class<Users> entityClass = Users.class;
    private static final Class<UsersDTO> dtoClass = UsersDTO.class;
    public UsersService(GenericRepository<Users, UsersDTO> repository) {
        super( entityClass, dtoClass);
    }
}

package com.example.demo.service.impl;


import com.example.demo.dto.RoleDTO;
import com.example.demo.entities.Role;
import com.example.demo.repository.generic.GenericRepository;
import com.example.demo.service.generic.ServiceGenericImpl;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends ServiceGenericImpl<Role, RoleDTO> {

    private static final Class<Role> entityClass = Role.class;
    private static final Class<RoleDTO> dtoClass = RoleDTO.class;
    public RoleService(GenericRepository<Role, RoleDTO> genericRepository) {
        super( entityClass, dtoClass);
    }


}

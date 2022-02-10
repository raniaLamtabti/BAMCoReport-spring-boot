package com.example.demo.service.impl;


import com.example.demo.dto.GroupsDTO;
import com.example.demo.entities.Groups;
import com.example.demo.repository.generic.GenericRepository;
import com.example.demo.service.generic.ServiceGenericImpl;
import org.springframework.stereotype.Service;

@Service
public class GroupsService extends ServiceGenericImpl<Groups, GroupsDTO >  {

    private static final Class<Groups> entityClass = Groups.class;
    private static final Class<GroupsDTO> dtoClass = GroupsDTO.class;


    public GroupsService(GenericRepository<Groups, GroupsDTO> genericRepository) {
        super(genericRepository, entityClass, dtoClass);
    }
}

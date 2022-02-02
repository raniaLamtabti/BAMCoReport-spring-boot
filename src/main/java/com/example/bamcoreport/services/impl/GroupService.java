package com.example.bamcoreport.services.impl;

import com.example.bamcoreport.dto.model.GroupDto;
import com.example.bamcoreport.entities.Group;
import com.example.bamcoreport.mapper.IMapper;
import com.example.bamcoreport.repositories.GroupRepository;
import com.example.bamcoreport.services.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService implements CrudService<GroupDto, Group> {

    @Autowired
    private GroupRepository groupRepository;


    @Autowired
    IMapper<Group, GroupDto> groupMapper;


    @Override
    public List<GroupDto> getAll() {
        List<Group> groups = groupRepository.findAll();
        return groupMapper.toListDto(groups, GroupDto.class);
    }

    @Override
    public Group find(long id) {
        return groupRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Group with id " + id + " does not exist"));

    }

    @Override
    public Group create(Group obj) {
        boolean ifExist = groupRepository.existsById(obj.getId());
        if (ifExist) {
            throw new IllegalArgumentException("Group with id " + obj.getId() + " already exist");
        }
        return groupRepository.save(obj);
    }

    @Override
    public Group update(Long id, Group obj) {
        boolean ifExist = groupRepository.existsById(id);
        if (!ifExist) {
            throw new IllegalArgumentException("Group with id " + id + " does not exist");
        }
        obj.setId(id);
        return groupRepository.save(obj);
    }

     @Override
    public void delete(Long id) {
        boolean ifExist = groupRepository.existsById(id);
        if (!ifExist) {
            throw new IllegalArgumentException("Group with id " + id + " does not exist");
        }
        groupRepository.deleteById(id);
    }
}

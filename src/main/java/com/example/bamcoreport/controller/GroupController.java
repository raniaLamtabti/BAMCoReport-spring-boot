package com.example.bamcoreport.controller;

import com.example.bamcoreport.dto.model.GroupDto;
import com.example.bamcoreport.entities.Group;
import com.example.bamcoreport.services.CrudService;
import com.example.bamcoreport.util.GenericController;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/group")
public class GroupController extends GenericController<GroupDto, Group> {


    public GroupController(CrudService<GroupDto, Group> service) {
        super(service);
    }
}

package com.example.demo.controller;

import com.example.demo.controller.generic.ControllerGenericImpl;
import com.example.demo.dto.TestDTO;
import com.example.demo.entities.Test;
import com.example.demo.service.generic.ServiceGeneric;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Test")
public class GroupController extends ControllerGenericImpl<Test,TestDTO>  {

    protected GroupController(ServiceGeneric<Test,TestDTO> genericService) {
        super(genericService);
    }
}

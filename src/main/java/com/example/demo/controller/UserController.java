package com.example.demo.controller;

import com.example.demo.controller.generic.ControllerGenericImpl;
import com.example.demo.dto.UsersDTO;
import com.example.demo.entities.Users;
import com.example.demo.service.generic.ServiceGeneric;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserController extends ControllerGenericImpl<Users, UsersDTO> {
    protected UserController(ServiceGeneric<Users, UsersDTO> genericService) {
        super(genericService);
    }
}

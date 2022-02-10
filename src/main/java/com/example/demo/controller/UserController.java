package com.example.demo.controller;

import com.example.demo.controller.generic.ControllerGenericImpl;
import com.example.demo.dto.UsersDTO;
import com.example.demo.entities.Users;
import com.example.demo.service.generic.ServiceGeneric;
import com.example.demo.service.impl.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;

@RestController
@RequestMapping(value = "/users")
public class UserController extends ControllerGenericImpl<Users, UsersDTO> {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    private final PasswordEncoder passwordEncoder;
    private final UsersService userService;
    /*private final ServiceGeneric<T,D> genericService;*/
    protected UserController(ServiceGeneric<Users, UsersDTO> genericService, PasswordEncoder passwordEncoder, UsersService userService) {

        super(genericService);

        this.passwordEncoder = passwordEncoder;
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody UsersDTO user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        log.info(user.getPassword());
        try {
            return new ResponseEntity(userService.save(user), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

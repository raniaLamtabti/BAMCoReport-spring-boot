package com.example.demo.service.impl;


import com.example.demo.dto.UserContactInfoDTO;
import com.example.demo.entities.Role;
import com.example.demo.entities.UserContactInfo;
import com.example.demo.service.IUserContactInfoService;
import com.example.demo.service.generic.ServiceGenericImpl;
import org.springframework.stereotype.Service;

@Service
public class UserContactInfoService extends ServiceGenericImpl<UserContactInfo, UserContactInfoDTO> implements IUserContactInfoService {

    private static final Class<UserContactInfo> entityClass = UserContactInfo.class;
    private static final Class<UserContactInfoDTO> dtoClass = UserContactInfoDTO.class;

    public UserContactInfoService() {
        super(entityClass, dtoClass);
    }
}

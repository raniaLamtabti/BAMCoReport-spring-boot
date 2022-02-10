package com.example.demo.service.impl;


import com.example.demo.dto.UserContactInfoDTO;
import com.example.demo.entities.UserContactInfo;
import com.example.demo.repository.generic.GenericRepository;
import com.example.demo.service.generic.ServiceGenericImpl;
import org.springframework.stereotype.Service;

@Service
public class UserContactInfoService extends ServiceGenericImpl<UserContactInfo, UserContactInfoDTO>  {


    private static final Class<UserContactInfo> entityClass = UserContactInfo.class;
    private static final Class<UserContactInfoDTO> dtoClass = UserContactInfoDTO.class;
    private static GenericRepository<UserContactInfo, Long> genericRepository;


    public UserContactInfoService(GenericRepository<UserContactInfo, UserContactInfoDTO> genericRepository) {
        super( entityClass, dtoClass);
    }

}

package com.example.demo.service.impl;


import com.example.demo.dto.ProfileDTO;
import com.example.demo.entities.Profile;
import com.example.demo.repository.generic.GenericRepository;
import com.example.demo.service.generic.ServiceGenericImpl;
import org.springframework.stereotype.Service;

@Service
public class ProfileService extends ServiceGenericImpl<Profile, ProfileDTO>  {


    private static final Class<ProfileDTO> dtoClass = ProfileDTO.class;
    private static final Class<Profile> entityClass = Profile.class;


    public ProfileService(GenericRepository<Profile, ProfileDTO> repository) {
        super(repository, entityClass, dtoClass);
    }

}

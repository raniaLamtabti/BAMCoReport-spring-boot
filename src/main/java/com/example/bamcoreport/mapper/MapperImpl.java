package com.example.bamcoreport.mapper;

import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MapperImpl<E, D> implements IMapper<E, D> {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public D toDto(E entity, Class<D> dtoClass) {
        if(entity == null){
            return null;
        }
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT).setPropertyCondition(Conditions.isNotNull());
        return modelMapper.map(entity,dtoClass);

    }

    @Override
    public E toEntity(D dto, Class<E> entityClass) {
        if(dto == null)
            return null;

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT).setPropertyCondition(Conditions.isNotNull());
        return modelMapper.map(dto, entityClass);
    }

    @Override
    public List<D> toListDto(Collection<E> entityList, Class<D> outCLass) {
        if(entityList == null)
            return Collections.emptyList();

        return entityList.stream().map(entity -> toDto(entity, outCLass)).collect(Collectors.toList());
    }

    @Override
    public List<E> toListEntity(Collection<D> dtoList, Class<E> outCLass) {
        if(dtoList == null)
            return Collections.emptyList();

        return dtoList.stream().map(dto -> toEntity(dto, outCLass)).collect(Collectors.toList());
    }
}

package com.example.demo.mapper;

import io.swagger.annotations.Api;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class IMapperImpl<E,D> implements IMapper<E,D> {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public D toDto(E entity, Class<D> dtoClass) {
        if (entity == null) {
            return null;
        }
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT).setPropertyCondition(Conditions.isNotNull());
        return modelMapper.map(entity,dtoClass);
    }

    @Override
    public E toEntity(D dto, Class<E> entityClass) {
        if (dto == null) {
            return null;
        }
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT).setPropertyCondition(Conditions.isNotNull());
        return modelMapper.map(dto, entityClass);
    }

    @Override
    public List<D> toDtoList(List<E> entityList, Class<D> dtoClass) {
        if (entityList == null) {
            return null;
        }
        return entityList.stream().map(entity -> toDto(entity, dtoClass)).collect(Collectors.toList());
    }

    @Override
    public List<E> toEntityList(List<D> dtoList, Class<E> entityClass) {
        if (dtoList == null) {
            return null;
        }
        return dtoList.stream().map(dto -> toEntity(dto, entityClass)).collect(Collectors.toList());
    }
}

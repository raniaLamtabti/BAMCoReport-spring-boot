package com.example.demo.mapper;

import java.util.List;

public interface IMapper<E,D> {

    D toDto(E entity, Class<D> dtoClass);

    E toEntity(D dto, Class<E> entityClass);

    List<D> toDtoList(List<E> entityList, Class<D> dtoClass);

    List<E> toEntityList(List<D> dtoList, Class<E> entityClass);

}

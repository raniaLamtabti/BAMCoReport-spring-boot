package com.example.bamcoreport.mapper;

import java.util.Collection;
import java.util.List;

public interface IMapper<E,D> {

    D toDto(E entity, Class<D> dtoClass);

    E toEntity(D dto, Class<E> entityClass);

    List<D> toListDto(Collection<E> entityList, Class<D> outCLass);

    List<E> toListEntity(Collection<D> dtoList, Class<E> outCLass);
}

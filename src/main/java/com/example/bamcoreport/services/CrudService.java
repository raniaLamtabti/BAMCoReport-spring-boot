package com.example.bamcoreport.services;


import java.util.List;

public interface CrudService<D,E> {
    List<D> getAll();

    E find(long id);

    E create(E obj);

    E update(Long id, E obj);

    void delete(Long id);
}

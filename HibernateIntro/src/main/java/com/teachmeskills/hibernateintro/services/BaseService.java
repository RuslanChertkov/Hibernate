package com.teachmeskills.hibernateintro.services;

import java.util.List;

public interface BaseService<T> {
    List<T> findAll();
    T findById(long id);
    boolean create(T entity);
    T update(T entity);
    boolean deleteById(long id);
}

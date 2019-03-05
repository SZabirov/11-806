package com.company.dao;

public interface CrudDao<T> {
    //create
    T save(T model);

    //read
    T find(Long id);

    //update
    void update(T model);

    //delete
    void delete(Long id);
}

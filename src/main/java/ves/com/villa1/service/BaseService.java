package ves.com.villa1.service;

import java.util.List;

public interface BaseService<T> {

    T findById(int id);

    List<T> findAll();

    Boolean deleteById(int id);

    T updateById(int id, T t);

    T save(T t);

}

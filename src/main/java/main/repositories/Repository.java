package main.repositories;

import java.util.List;

public interface Repository<ID, T> {
    T save(T entity);

    void delete(ID id);

    List<T> findAll();

    T findById(ID id);
}

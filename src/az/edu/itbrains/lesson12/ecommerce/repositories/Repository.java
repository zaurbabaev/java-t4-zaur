package az.edu.itbrains.lesson12.ecommerce.repositories;

import java.util.List;

public interface Repository<T> {
    void create(T model);

    void update(T model);

    void delete(T model);

    T find(T model);

    List<T> findAll();
}

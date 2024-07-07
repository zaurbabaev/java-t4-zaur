package az.edu.itbrains.lesson12.ecommerce.repositories;

import az.edu.itbrains.lesson12.ecommerce.models.Category;
import az.edu.itbrains.lesson12.ecommerce.models.Product;

import java.util.Locale;

public interface Repository<T> {
    void create(T model);

    void update(T model);
}

package com.itau.controlefinanceiro.repositories.implementations;

import com.itau.controlefinanceiro.entities.Category;
import com.itau.controlefinanceiro.repositories.ICategoryRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Repository
public class LocalCategoryRepository implements ICategoryRepository {

    List<Category> database = new ArrayList<>();

    @Override
    public void save(Category category) {
        database.add(category);
    }

    @Override
    public Category findByName(String name) {

        Category category = new Category();

        category = getCategory(name, category);

        return category;
    }

    @Override
    public List<Category> findAll() {
        return database;
    }

    @Override
    public void delete(String name) {
        Category category = new Category();
        category = getCategory(name, category);
        database.remove(database.indexOf(category));
    }

    @Override
    public Category update(String name, String newName) {

        Category category = new Category();
        for (var element : database) {
            if (element.getName().equals(name)) {
                element.setName(newName);
                category = element;
            }
        }
        return category;
    }

    private Category getCategory(String name, Category category) {
        for (var element : database) {
            if (element.getName().equals(name)) {
                category = element;
            }
        }
        return category;
    }
}

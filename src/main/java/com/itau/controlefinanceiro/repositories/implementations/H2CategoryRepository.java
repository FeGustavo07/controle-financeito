package com.itau.controlefinanceiro.repositories.implementations;

import com.itau.controlefinanceiro.entities.Category;
import com.itau.controlefinanceiro.repositories.ICategoryRepository;

import java.util.ArrayList;
import java.util.List;

public class H2CategoryRepository implements ICategoryRepository {

    List<Category> database = new ArrayList<>();

    @Override
    public void save(Category category) {
        database.add(category);
    }

    @Override
    public Category findByName(String name) {
        return (Category) database.stream().filter(category -> category.getName().equals(name));
    }
}

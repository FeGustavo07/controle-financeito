package com.itau.controlefinanceiro.repositories;

import com.itau.controlefinanceiro.entities.Category;

import java.util.List;


public interface ICategoryRepository {
    void save(Category category);
    Category findByName(String name);
    List<Category> findAll();
    void delete(String name);
    Category update(String name, String newName);
}

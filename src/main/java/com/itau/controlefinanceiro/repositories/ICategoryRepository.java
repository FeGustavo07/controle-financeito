package com.itau.controlefinanceiro.repositories;

import com.itau.controlefinanceiro.entities.Category;

public interface ICategoryRepository {
    void save(Category category);
    Category findByName(String name);
}

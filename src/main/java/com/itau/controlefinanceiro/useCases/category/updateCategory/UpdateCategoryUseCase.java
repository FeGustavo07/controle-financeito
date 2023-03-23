package com.itau.controlefinanceiro.useCases.category.updateCategory;

import com.itau.controlefinanceiro.entities.Category;
import com.itau.controlefinanceiro.repositories.ICategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UpdateCategoryUseCase {

    private final ICategoryRepository categoryRepository;

    public Category execute(String name, String newName) {
        return categoryRepository.update(name, newName);
    }
}

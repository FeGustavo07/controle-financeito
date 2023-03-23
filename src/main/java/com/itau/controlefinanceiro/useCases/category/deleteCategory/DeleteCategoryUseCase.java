package com.itau.controlefinanceiro.useCases.category.deleteCategory;

import com.itau.controlefinanceiro.repositories.ICategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DeleteCategoryUseCase {

    private final ICategoryRepository categoryRepository;

    public void execute(String name) {
        categoryRepository.delete(name);
    }
}

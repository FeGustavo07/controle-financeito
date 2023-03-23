package com.itau.controlefinanceiro.useCases.category.getAllCategories;

import com.itau.controlefinanceiro.entities.Category;
import com.itau.controlefinanceiro.repositories.ICategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GetAllCategoriesUseCase {

    private final ICategoryRepository iCategoryRepository;

    public List<Category> execute() {
        return iCategoryRepository.findAll();
    }
}

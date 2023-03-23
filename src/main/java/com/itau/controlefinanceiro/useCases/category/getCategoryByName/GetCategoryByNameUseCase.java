package com.itau.controlefinanceiro.useCases.category.getCategoryByName;

import com.itau.controlefinanceiro.entities.Category;
import com.itau.controlefinanceiro.repositories.ICategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GetCategoryByNameUseCase {

    private final ICategoryRepository iCategoryRepository;

    public Category execute(String name) {
        return iCategoryRepository.findByName(name);
    }
}

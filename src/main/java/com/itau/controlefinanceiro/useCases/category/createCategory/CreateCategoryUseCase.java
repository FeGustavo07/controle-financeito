package com.itau.controlefinanceiro.useCases.category.createCategory;

import com.itau.controlefinanceiro.entities.Category;
import com.itau.controlefinanceiro.repositories.ICategoryRepository;
import com.itau.controlefinanceiro.useCases.category.createCategory.CreateCategoryDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CreateCategoryUseCase {

    private final ICategoryRepository iCategoryRepository;

    public void execute(CreateCategoryDTO createCategoryDTO) {
        var category = new Category(createCategoryDTO);
        iCategoryRepository.save(category);
    }
}

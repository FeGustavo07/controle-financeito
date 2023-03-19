package com.itau.controlefinanceiro.useCases.category.createCategory;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/category")
@RequiredArgsConstructor
public class CreateCategoryController {

    private final CreateCategoryUseCase createCategoryUseCase;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createCategory(@RequestBody CreateCategoryDTO createCategory) {
        createCategoryUseCase.execute(createCategory);
    }
}

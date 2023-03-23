package com.itau.controlefinanceiro.useCases.category.deleteCategory;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/category")
@RequiredArgsConstructor
public class DeleteCategoryController {

    private final DeleteCategoryUseCase deleteCategoryUseCase;

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void delete(@RequestParam String name) {
        deleteCategoryUseCase.execute(name);
    }
}

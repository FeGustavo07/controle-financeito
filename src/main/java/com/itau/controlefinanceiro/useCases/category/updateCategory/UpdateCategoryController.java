package com.itau.controlefinanceiro.useCases.category.updateCategory;

import com.itau.controlefinanceiro.entities.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/category")
@RequiredArgsConstructor
public class UpdateCategoryController {

    private final UpdateCategoryUseCase updateCategoryUseCase;

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Category update(@RequestParam String name, @RequestBody String newName) {
        return updateCategoryUseCase.execute(name, newName);
    }
}

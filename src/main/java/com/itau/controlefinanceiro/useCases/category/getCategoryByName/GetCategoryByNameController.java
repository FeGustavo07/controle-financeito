package com.itau.controlefinanceiro.useCases.category.getCategoryByName;

import com.itau.controlefinanceiro.entities.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/category")
@RequiredArgsConstructor
public class GetCategoryByNameController {

    private final GetCategoryByNameUseCase getCategoryByNameUseCase;

    @GetMapping("{name}")
    @ResponseStatus(HttpStatus.OK)
    public Category getCategoryByName(@PathVariable String name) {
        return getCategoryByNameUseCase.execute(name);
    }
}

package com.itau.controlefinanceiro.useCases.category.getCategoryByName;

import com.itau.controlefinanceiro.entities.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/category/name")
@RequiredArgsConstructor
public class GetCategoryByNameController {

    private final GetCategoryByNameUseCase getCategoryByNameUseCase;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public Category getCategoryByName(@RequestParam String name) {
        return getCategoryByNameUseCase.execute(name);
    }
}

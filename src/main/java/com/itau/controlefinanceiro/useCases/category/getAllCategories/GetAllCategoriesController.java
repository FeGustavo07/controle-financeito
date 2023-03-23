package com.itau.controlefinanceiro.useCases.category.getAllCategories;

import com.itau.controlefinanceiro.entities.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/category")
@RequiredArgsConstructor
public class GetAllCategoriesController {

    private final GetAllCategoriesUseCase getAllCategoriesUseCase;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Category> findAll() {
        return getAllCategoriesUseCase.execute();
    }
}

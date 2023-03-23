package com.itau.controlefinanceiro.entities;

import com.itau.controlefinanceiro.useCases.category.createCategory.CreateCategoryDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class Category {
    private UUID id;
    private String name;

    public Category(CreateCategoryDTO createCategoryDTO) {
        this.id = UUID.randomUUID();
        this.name = createCategoryDTO.getName();
    }
}

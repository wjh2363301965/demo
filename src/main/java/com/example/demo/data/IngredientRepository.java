package com.example.demo.data;

import com.example.demo.Ingredient;

import java.util.Optional;

/**
 * @Auther:剑豪
 * @Date:2023/6/26
 * @VERSON:1.8
 */

public interface IngredientRepository {
    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);

}

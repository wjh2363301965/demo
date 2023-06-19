package com.example.demo;

import lombok.Data;

import java.util.List;

/**
 * @Auther:剑豪
 * @Date:2023/6/14
 * @VERSON:1.8
 */
@Data
public class Taco {
    private String name;

    private List<Ingredient> ingredients;
}

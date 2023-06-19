package com.example.demo;

import lombok.Data;

/**
 * @Auther:剑豪
 * @Date:2023/6/14
 * @VERSON:1.8
 */@Data
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}


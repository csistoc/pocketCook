package com.example.pocketCook.dto;

public class CreateIngredientDto {

    private String name;

    public CreateIngredientDto() { }

    public CreateIngredientDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

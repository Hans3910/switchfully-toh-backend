package com.example.demo.service;

public class HeroDto {
    // refresher for Dtos
    // Can you make these fields private?
    private int id;
    private String name;

    // refresher for Dtos
    // Is a no-args constructor needed for Dtos?
    public HeroDto() {
    }

    public HeroDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // refresher for Dtos
    // Which getter/setter is really needed?
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

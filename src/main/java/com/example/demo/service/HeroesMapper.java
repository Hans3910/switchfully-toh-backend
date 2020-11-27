package com.example.demo.service;

import com.example.demo.repository.Hero;
import org.springframework.stereotype.Component;

@Component
public class HeroesMapper {
    public HeroDto toDto(Hero hero) {
        return new HeroDto(hero.getId(), hero.getName());
    }
}

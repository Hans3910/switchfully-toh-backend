package com.example.demo.api;

import com.example.demo.service.HeroDto;
import com.example.demo.service.HeroesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/heroes")
public class HeroesController {

    private final HeroesService heroService;

    @Autowired
    public HeroesController(HeroesService heroService) {
        this.heroService = heroService;
    }

    @GetMapping
    public List<HeroDto> getHeroes(){
        return heroService.getHeroes();
    }

    @GetMapping("/{id}")
    public HeroDto getHero(@PathVariable int id) {
        return heroService.getHero(id);
    }
}

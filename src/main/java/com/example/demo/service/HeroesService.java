package com.example.demo.service;

import com.example.demo.repository.HeroesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HeroesService {


    private final HeroesRepository heroesRepository;
    private final HeroesMapper heroesMapper;

    @Autowired
    public HeroesService(HeroesRepository heroesRepository, HeroesMapper heroesMapper) {
        this.heroesRepository = heroesRepository;
        this.heroesMapper = heroesMapper;
    }


    public List<HeroDto> getHeroes() {
        return heroesRepository.findAll()
                .stream()
                .map(heroesMapper::toDto)
                .collect(Collectors.toList());
    }

    public HeroDto getHero(int id) {
        return heroesMapper.toDto(heroesRepository.findById(id)
                .orElseThrow(() -> new HeroNotFoundException()));
    }
}

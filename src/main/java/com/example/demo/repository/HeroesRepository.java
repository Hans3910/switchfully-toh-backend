package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface HeroesRepository extends CrudRepository<Hero, Integer> {
    ArrayList<Hero> findAll();
}

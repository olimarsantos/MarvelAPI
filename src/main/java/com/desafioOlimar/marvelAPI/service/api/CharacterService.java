package com.desafioOlimar.marvelAPI.service.api;

import com.desafioOlimar.marvelAPI.model.Character;

import java.util.List;

public interface CharacterService {

    List<Character> findAll();

    Character findById(Integer id);
}

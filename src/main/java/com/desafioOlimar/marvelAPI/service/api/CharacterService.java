package com.desafioOlimar.marvelAPI.service.api;

import com.desafioOlimar.marvelAPI.model.CharacterModel;

import java.util.List;

public interface CharacterService {

    List<CharacterModel> findAll();

    CharacterModel findById(Integer id);
}

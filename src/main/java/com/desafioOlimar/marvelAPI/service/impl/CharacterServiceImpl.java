package com.desafioOlimar.marvelAPI.service.impl;

import com.desafioOlimar.marvelAPI.model.CharacterModel;
import com.desafioOlimar.marvelAPI.repository.CharacterRepository;
import com.desafioOlimar.marvelAPI.service.api.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

import static com.desafioOlimar.marvelAPI.service.utils.Constants.CHARACTER_NOT_FOUND;

@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    private CharacterRepository repository;

    @Autowired
    private Optional<CharacterModel> character;

    @Override
    public List<CharacterModel> findAll() {
        return repository.findAll();
    }

    @Override
    public CharacterModel findById(Integer id) {
        character = repository.findById(id);
        if (character.isPresent()) {
            return character.get();
        }
        throw new EntityNotFoundException(CHARACTER_NOT_FOUND);
    }
}

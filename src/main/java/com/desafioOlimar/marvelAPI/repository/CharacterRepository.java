package com.desafioOlimar.marvelAPI.repository;

import com.desafioOlimar.marvelAPI.model.CharacterModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<CharacterModel, Integer> {
}

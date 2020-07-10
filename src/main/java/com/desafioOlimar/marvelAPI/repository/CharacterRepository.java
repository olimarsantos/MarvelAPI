package com.desafioOlimar.marvelAPI.repository;

import com.desafioOlimar.marvelAPI.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Integer> {
}

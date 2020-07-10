package com.desafioOlimar.marvelAPI.service;

import com.desafioOlimar.marvelAPI.model.Character;
import com.desafioOlimar.marvelAPI.service.api.CharacterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityNotFoundException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class CharacterServiceTests {

    private final Integer VALID_CHARACTER = 1;
    private final Integer ALL_CHARACTERS = 6;
    private final Integer INVALID_CHARACTER = 999;
    private final String VALID_NAME_CHARACTER = "Iron Man";

    @Autowired
    private CharacterService service;


    @Test
    void testReturnValidCharacter() {
        Character character = service.findById(VALID_CHARACTER);
        assertThat(character.getName()).isEqualToIgnoringCase(VALID_NAME_CHARACTER);
    }

    @Test
    void testReturnInvalidCharacter() {
        assertThrows(EntityNotFoundException.class, () -> {
            service.findById(INVALID_CHARACTER);
        });
    }

    @Test
    void testReturnAllCharacters() {
        List<Character> listCharacters = service.findAll();
        assertThat(listCharacters.size()).isEqualTo(ALL_CHARACTERS);
    }
}

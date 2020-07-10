package com.desafioOlimar.marvelAPI.controller.endpoint.rest;

import com.desafioOlimar.marvelAPI.model.*;
import com.desafioOlimar.marvelAPI.model.Character;
import com.desafioOlimar.marvelAPI.service.api.CharacterService;
import io.swagger.annotations.ApiOperation;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@NoArgsConstructor
@RestController
@RequestMapping("v1/public/characters")
public class CharacterController {

    @Autowired
    private CharacterService service;


    @ApiOperation(value = "Fetches lists of comic characters.",
            notes = "Fetches lists of comic characters.")
    @GetMapping
    public ResponseEntity<List<Character>> getCharacters() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @ApiOperation(value = "This method fetches a single character resource.",
            notes = "This method fetches a single character resource.")
    @GetMapping("/{characterId}")
    public ResponseEntity<List<Character>> getCharacterById(@PathVariable int characterId) {
        Character character = service.findById(characterId);
        return new ResponseEntity(character, HttpStatus.OK);
    }

    @ApiOperation(value = "Fetches lists of comics containing a specific character.",
            notes = "Fetches lists of comics containing a specific character.")
    @GetMapping("/{characterId}/comics")
    public ResponseEntity<List<Comic>> getCharacterComics(@PathVariable int characterId) {

        Character character = service.findById(characterId);
        return new ResponseEntity<>(character.getComics(), HttpStatus.OK);
    }

    @ApiOperation(value = "Fetches lists of events in which a specific character appears.",
            notes = "Fetches lists of events in which a specific character appears.")
    @GetMapping("/{characterId}/events")
    public ResponseEntity<List<Event>> getCharacterEvents(@PathVariable int characterId) {

        Character character = service.findById(characterId);
        return new ResponseEntity<>(character.getEvents(), HttpStatus.OK);
    }

    @ApiOperation(value = "Fetches lists of comic series in which a specific character appears.",
            notes = "Fetches lists of comic series in which a specific character appears.")
    @GetMapping("/{characterId}/series")
    public ResponseEntity<List<Serie>> getCharacterSeries(@PathVariable int characterId) {

        Character character = service.findById(characterId);
        return new ResponseEntity<>(character.getSeries(), HttpStatus.OK);
    }

    @ApiOperation(value = "Fetches lists of comic stories featuring a specific character.",
            notes = "Fetches lists of comic stories featuring a specific character.")
    @GetMapping("/{characterId}/stories")
    public ResponseEntity<List<Story>> getCharacterStories(@PathVariable int characterId) {

        Character character = service.findById(characterId);
        return new ResponseEntity<>(character.getStories(), HttpStatus.OK);
    }
}

package com.desafioOlimar.marvelAPI.controller;

import com.desafioOlimar.marvelAPI.model.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CharacterControllerTests {

    private final String BASE_URI = "/v1/public/characters";
    private final String VALID_URI = "/4";
    private final String VALID_NAME = "Black Panther";

    private final String VALID_COMIC = "/2/comics";
    private final String VALID_COMIC_TITLE = "Amazing Spider-Man (1999) #558 (Turner Variant)";
    private final String INVALID_COMIC = "/888/comics";

    private final String VALID_EVENT = "/1/events";
    private final String VALID_EVENT_TITLE = "Age of Ultron";
    private final String INVALID_EVENT = "/888/events";

    private final String VALID_SERIES = "/2/series";
    private final String VALID_SERIES_TITLE = "A+X (2012 - 2014)";
    private final String INVALID_SERIES = "/888/series";

    private final String VALID_STORY = "/1/stories";
    private final String VALID_STORIES_TITLE = "Fantastic Four (1998)";
    private final String INVALID_STORY = "/888/stories";

    private final String INVALID_URI = "/666";


    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testReturnListCharactersStatusOk() throws Exception {
        ResponseEntity<List<CharacterModel>> response = restTemplate.exchange(
                BASE_URI, HttpMethod.GET, null, new ParameterizedTypeReference<List<CharacterModel>>() {
                });
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    public void testReturnCharacterByIdStatusOk() throws Exception {
        ResponseEntity<CharacterModel> response = restTemplate.exchange(
                BASE_URI.concat(VALID_URI), HttpMethod.GET, null, new ParameterizedTypeReference<CharacterModel>() {});
        assertThat(response.getBody().getName()).isEqualToIgnoringCase(VALID_NAME);
    }

    @Test
    public void testReturnListCharactersStatusNotFound() throws Exception {
        ResponseEntity<CharacterModel> response = restTemplate.exchange(
                BASE_URI.concat(INVALID_URI), HttpMethod.GET, null, new ParameterizedTypeReference<CharacterModel>() {});
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
    }

    @Test
    public void testReturnListComicsStatusOk() throws Exception {
        ResponseEntity<List<ComicModel>> response = restTemplate.exchange(
                BASE_URI.concat(VALID_COMIC), HttpMethod.GET, null, new ParameterizedTypeReference<List<ComicModel>>() {});
        assertThat(response.getBody().get(0).getTitle()).isEqualToIgnoringCase(VALID_COMIC_TITLE);
    }

    @Test
    public void testReturnListComicsStatusNotFound() throws Exception {
        ResponseEntity<List<ComicModel>> response = restTemplate.exchange(
                BASE_URI.concat(INVALID_COMIC), HttpMethod.GET, null, new ParameterizedTypeReference<List<ComicModel>>() {});
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
    }

    @Test
    public void testReturnListEventsStatusOk() throws Exception {
        ResponseEntity<List<EventModel>> response = restTemplate.exchange(
                BASE_URI.concat(VALID_EVENT), HttpMethod.GET, null, new ParameterizedTypeReference<List<EventModel>>() {});
        assertThat(response.getBody().get(0).getTitle()).isEqualToIgnoringCase(VALID_EVENT_TITLE);
    }

    @Test
    public void testReturnListEventsStatusNotFound() throws Exception {
        ResponseEntity<List<EventModel>> response = restTemplate.exchange(
                BASE_URI.concat(INVALID_EVENT), HttpMethod.GET, null, new ParameterizedTypeReference<List<EventModel>>() {});
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
    }

    @Test
    public void testReturnListSeriesStatusOk() throws Exception {
        ResponseEntity<List<SerieModel>> response = restTemplate.exchange(
                BASE_URI.concat(VALID_SERIES), HttpMethod.GET, null, new ParameterizedTypeReference<List<SerieModel>>() {});
        assertThat(response.getBody().get(0).getTitle()).isEqualToIgnoringCase(VALID_SERIES_TITLE);
    }

    @Test
    public void testReturnListSeriesStatusNotFound() throws Exception {
        ResponseEntity<List<SerieModel>> response = restTemplate.exchange(
                BASE_URI.concat(INVALID_SERIES), HttpMethod.GET, null, new ParameterizedTypeReference<List<SerieModel>>() {});
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
    }

    @Test
    public void testReturnListStoriesStatusOk() throws Exception {
        ResponseEntity<List<StoryModel>> response = restTemplate.exchange(
                BASE_URI.concat(VALID_STORY), HttpMethod.GET, null, new ParameterizedTypeReference<List<StoryModel>>() {});
        assertThat(response.getBody().get(0).getTitle()).isEqualToIgnoringCase(VALID_STORIES_TITLE);
    }

    @Test
    public void testReturnListStoriesStatusNotFound() throws Exception {
        ResponseEntity<List<StoryModel>> response = restTemplate.exchange(
                BASE_URI.concat(INVALID_STORY), HttpMethod.GET, null, new ParameterizedTypeReference<List<StoryModel>>() {});
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
    }

}

package com.desafioOlimar.marvelAPI.model;

import lombok.Data;
import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "CHARACTERS")
public class Character implements Serializable {

    private static final long serialVersionID = 1l;

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String description;

    @Column
    private String name;

    @Column
    private Date modified;

    @Column
    private String resourceURI;

    @Column
    private String urls;

    @Column
    private String thumbnail;

    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(name = "CHARACTERS_COMIC",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "comic_id"))
    @Lazy
    private List<Comic> comics;

    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(name = "CHARACTERS_EVENT",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "event_id"))
    @Lazy
    private List<Event> events;

    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(name = "CHARACTERS_SERIE",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "serie_id"))
    @Lazy
    private List<Serie> series;

    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(name = "CHARACTERS_STORY",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "story_id"))
    @Lazy
    private List<Story> stories;
}

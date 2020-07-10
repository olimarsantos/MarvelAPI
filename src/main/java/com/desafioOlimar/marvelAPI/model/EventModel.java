package com.desafioOlimar.marvelAPI.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Component
@Table(name = "EVENT")
public class EventModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String resourceURI;

    @Column
    private Date modified;

    @Column
    private Date start;

    @Column
    private Date end;
}

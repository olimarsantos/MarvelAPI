package com.desafioOlimar.marvelAPI.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "SERIE")
public class Serie implements Serializable {

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
    private Integer startYear;

    @Column
    private Integer endYear;

    @Column
    private String rating;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;
}

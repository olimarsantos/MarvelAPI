package com.desafioOlimar.marvelAPI.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Table(name = "COMIC")
public class Comic implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private Integer digitalId;

    @Column
    private String title;

    @Column
    private BigDecimal issueNumber;

    @Column
    private String variantDescription;

    @Column
    private String description;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;

    @Column
    private String isbn;

    @Column
    private String upc;

    @Column
    private String diamondCode;

    @Column
    private String ean;

    @Column
    private String issn;

    @Column
    private String format;

    @Column
    private Integer pageCount;

    @Column
    private String resourceURI;
}

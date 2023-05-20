package com.example.task1516.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "departures")
public class Departure {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = false)
    private String type;

    @Column(nullable = false)
    private String departureDate;

    @Column
    private String eduType;

    @OneToMany(mappedBy = "departure")
    private List<PostOffice> postsoffice;

}

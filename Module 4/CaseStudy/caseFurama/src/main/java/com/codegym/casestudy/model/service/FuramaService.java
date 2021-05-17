package com.codegym.casestudy.model.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FuramaService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String name;
    private int area;
    private int cost;
    private int people;
    @ManyToOne
    private RentType rentType;

    @ManyToOne
    private ServiceType serviceType;



}

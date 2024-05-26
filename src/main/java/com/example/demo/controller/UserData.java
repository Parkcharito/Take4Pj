package com.example.demo.controller;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;

import java.sql.Struct;

@Entity
@Table(name = "USER_DATA")
@Data
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;

    private String name;

    @Column(name = "BIRTH_YEAR")
    private int birthY;

    @Column(name = "BIRTH_MONTH")
    private int birthM;

    @Column(name = "BIRTH_DAY")
    private int birthD;

    private String sex;



}

package com.ilhom.springboot.mapstruct_with_service.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Commerce")
public class Commerce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Basic
    @Column
    private String name;

    @Basic
    @Column
    private String surname;
    @Basic
    @Column
    private String department;
    @Basic
    @Column
    private int salary;

}

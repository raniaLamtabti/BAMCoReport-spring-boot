package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "test")
public class Test {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

}

package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "user_contact_info")
public class UserContactInfo {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "last_update")
    private Date lastUpdate;

    @Column(name = "address")
    private String address;

    @Column(name = "building")
    private String building;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "email")
    private String email;

    @Column(name = "fax")
    private String fax;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "personal", nullable = false)
    private Boolean personal;

    @Column(name = "phone")
    private String phone;

    @Column(name = "room")
    private String room;

    @Column(name = "state")
    private String state;

    @Column(name = "website")
    private String website;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "user_id")
    private Long userId;

}

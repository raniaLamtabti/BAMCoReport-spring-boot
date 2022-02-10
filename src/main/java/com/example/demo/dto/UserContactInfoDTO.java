package com.example.demo.dto;


import lombok.Data;

import java.sql.Date;

@Data
public class UserContactInfoDTO {
    private Long id;

    private Date creationDate;

    private Date lastUpdate;

    private String address;

    private String building;

    private String city;

    private String country;

    private String email;

    private String fax;

    private String mobile;

    private Boolean personal;

    private String phone;

    private String room;

    private String state;

    private String website;

    private String zipcode;

    private Long userId;

}

package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "users")
public class Users {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "last_update")
    private Date lastUpdate;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "enabled", nullable = false)
    private Boolean enabled;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "manager_user_id")
    private Long managerUserId;

    @Column(name = "password")
    private String password;

    @Column(name = "title")
    private String title;

    @Column(name = "username")
    private String username;

}

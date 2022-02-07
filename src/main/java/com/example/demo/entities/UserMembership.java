package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "user_membership")
public class UserMembership {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "last_update")
    private Date lastUpdate;

    @Column(name = "assigned_date")
    private Date assignedDate;

    @Column(name = "assigned_by")
    private Long assignedBy;

    @Column(name = "group_id")
    private Long groupId;

    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "user_id")
    private Long userId;

}

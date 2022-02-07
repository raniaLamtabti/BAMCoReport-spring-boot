package com.example.demo.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Date;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "groups")
public class Groups {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "creation_date")
    @CreationTimestamp
    private Date creationDate;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date lastUpdate;

    @Column(name = "description")
    private String description;

    @Column(name = "display_name")
    private String displayName;

    @Column(name = "name")
    private String name;

    @Column(name = "parent_path")
    private String parentPath;

    @Column(name = "created_by")
    private Long createdBy;

}

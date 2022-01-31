package com.example.bamcoreport.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Group {

    @Id @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    private String name;
    private String parentPath;
    private String displayName;
    private String description;
    @ManyToOne
    @JoinColumn(name = "created_by_id")
    private User createdBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date creationDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastUpdateDate;



}

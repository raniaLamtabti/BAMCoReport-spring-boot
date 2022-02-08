package com.example.demo.dto;


import com.example.demo.entities.Users;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@ApiModel("$table.tableComment")
public class GroupsDTO {


    private String name;
    private String parentPath;
    private String displayName;
    private String description;
    private Users createdBy;
    private LocalDateTime creationDate;
    private LocalDateTime lastUpdate;

}

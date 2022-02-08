package com.example.demo.dto;


import com.example.demo.entities.Groups;
import com.example.demo.entities.Profile;
import com.example.demo.entities.Role;
import com.example.demo.entities.Users;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.sql.Date;
import java.time.LocalDate;

@Data
@ApiModel("$table.tableComment")
public class RoleDTO {

    private String name;
    private String displayName;
    private String description;
    private Users createdBy;
    private LocalDate creationDate;
    private LocalDate lastUpdate;
}

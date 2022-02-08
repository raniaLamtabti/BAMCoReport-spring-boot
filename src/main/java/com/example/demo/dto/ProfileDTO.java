package com.example.demo.dto;


import com.example.demo.entities.Users;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.sql.Date;
import java.time.LocalDate;

@Data
@ApiModel("$table.tableComment")
public class ProfileDTO {

    private boolean isDefault;
    private String name;
    private String description;
    private LocalDate creationDate;
    private Users createdBy;
    private LocalDate lastUpdate;
    private Users lastUpdatedBy;

}

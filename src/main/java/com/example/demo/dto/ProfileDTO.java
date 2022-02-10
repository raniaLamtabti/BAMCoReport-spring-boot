package com.example.demo.dto;


import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.sql.Date;

@Data
@ApiModel("$table.tableComment")
public class ProfileDTO {
    private Long id;

    private Date creationDate;

    private Date lastUpdate;

    private String description;

    private Boolean defaultField;

    private String name;

    private Long createdBy;

    private Long lastUpdatedBy;

}

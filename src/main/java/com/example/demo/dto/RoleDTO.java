package com.example.demo.dto;


import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.sql.Date;

@Data
@ApiModel("$table.tableComment")
public class RoleDTO {

    private Date creationDate;

    private Date lastUpdate;

    private String description;

    private String displayName;

    private String name;

    private Long createdBy;

}

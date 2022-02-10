package com.example.demo.dto;


import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.sql.Date;

@Data
@ApiModel("$table.tableComment")
public class UsersDTO {
    private Long id;

    private Date creationDate;

    private Date lastUpdate;

    private Long createdBy;

    private Boolean enabled;

    private String firstName;

    private String jobTitle;

    private String lastName;

    private Long managerUserId;

    private String password;

    private String title;

    private String username;

}

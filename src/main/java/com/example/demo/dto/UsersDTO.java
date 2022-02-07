package com.example.demo.dto;


import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.sql.Date;

@Data
@ApiModel("$table.tableComment")
public class UsersDTO {

//    private Date creationDate;

//    private Date lastUpdate;

//    private Long createdBy;

//    private Boolean enabled;

    private String firstName;

    private String lastName;

    private String jobTitle;

    private String title;
//    private Long managerUserId;

    private String password;

    private String username;


}

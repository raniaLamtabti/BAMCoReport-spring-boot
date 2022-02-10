package com.example.demo.dto;


import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.sql.Date;

@Data
@ApiModel("$table.tableComment")
public class UserMembershipDTO {
    private Long id;

    private Date creationDate;

    private Date lastUpdate;

    private Date assignedDate;

    private Long assignedBy;

    private Long groupId;

    private Long roleId;

    private Long userId;

}

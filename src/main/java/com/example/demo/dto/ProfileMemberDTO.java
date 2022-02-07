package com.example.demo.dto;


import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.sql.Date;

@Data
@ApiModel("$table.tableComment")
public class ProfileMemberDTO {

    private Date creationDate;

    private Date lastUpdate;

    private Long groupId;

    private Long profileId;

    private Long roleId;

    private Long userId;

}

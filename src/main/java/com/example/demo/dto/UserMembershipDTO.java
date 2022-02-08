package com.example.demo.dto;


import com.example.demo.entities.Groups;
import com.example.demo.entities.Role;
import com.example.demo.entities.Users;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@ApiModel("$table.tableComment")
public class UserMembershipDTO {

    private Users user;
    private Role role;
    private Groups group;
    private Users assignedBy;
    private LocalDateTime assignedDate;

}

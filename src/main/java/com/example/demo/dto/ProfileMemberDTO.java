package com.example.demo.dto;


import com.example.demo.entities.Groups;
import com.example.demo.entities.Profile;
import com.example.demo.entities.Role;
import com.example.demo.entities.Users;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.sql.Date;

@Data
@ApiModel("$table.tableComment")
public class ProfileMemberDTO {

    private Profile profileId;
    private Users userId;
    private Role roleId;
    private Groups groupId;

}

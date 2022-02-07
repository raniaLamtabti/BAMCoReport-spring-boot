package com.example.demo.dto;


import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel("$table.tableComment")
public class TestDTO {

    private String name;

}

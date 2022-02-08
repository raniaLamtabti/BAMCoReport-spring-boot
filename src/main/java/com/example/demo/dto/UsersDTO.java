package com.example.demo.dto;


import com.example.demo.entities.UserContactInfo;
import com.example.demo.entities.Users;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@ApiModel("$table.tableComment")
public class UsersDTO {
    private UserContactInfo userContactInfo;
    private boolean enabled;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String title;
    private String jobTitle;
    private Users managerUserId;
    private Users createdBy;
    private LocalDateTime creationDate;
    private LocalDateTime lastUpdate;

    public UserContactInfo getUserContactInfo() {
        return userContactInfo;
    }

    public void setUserContactInfo(UserContactInfo userContactInfo) {
        this.userContactInfo = userContactInfo;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Users getManagerUserId() {
        return managerUserId;
    }

    public void setManagerUserId(Users managerUserId) {
        this.managerUserId = managerUserId;
    }

    public Users getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Users createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}

package com.springboot.lebron.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProjectJoinRequest {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private Integer userId;

    private Integer projectId;

    private Integer projectOwnerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getProjectOwnerId() {
        return projectOwnerId;
    }

    public void setProjectOwnerId(Integer projectOwnerId) {
        this.projectOwnerId = projectOwnerId;
    }
}

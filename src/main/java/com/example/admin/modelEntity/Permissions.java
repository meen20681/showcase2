package com.example.admin.modelEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Permissions {
@Id
@GeneratedValue
    private Integer permission_id;
    private String permission_name;
    private String permission_desc;

    public Integer getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(Integer permission_id) {
        this.permission_id = permission_id;
    }

    public String getPermission_name() {
        return permission_name;
    }

    public void setPermission_name(String permission_name) {
        this.permission_name = permission_name;
    }

    public String getPermission_desc() {
        return permission_desc;
    }

    public void setPermission_desc(String permission_desc) {
        this.permission_desc = permission_desc;
    }
}

package com.example.admin.Service;

import com.example.admin.modelEntity.Roles;
import com.example.admin.modelEntity.User;

import java.security.Permission;
import java.util.List;

public interface PermissionService {

    User savePermission(Permission permission);

    //read
    List<Roles> fecthRolesList();

    //Update
    User updatePermission(Permission permission,Integer permission_id);

    //Delete
    void deletePermissionByid(Integer permission_id);
}

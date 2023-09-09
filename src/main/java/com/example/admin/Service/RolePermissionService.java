package com.example.admin.Service;

import com.example.admin.modelEntity.RolePermissions;
import com.example.admin.modelEntity.User;

import java.util.List;


public interface RolePermissionService {


    RolePermissions saveRolePermissions(RolePermissions rolePermissions);
    List<RolePermissions> fecthRolePermissionList();
}

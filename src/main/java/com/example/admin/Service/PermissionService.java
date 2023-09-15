package com.example.admin.Service;

import com.example.admin.modelEntity.Permissions;

import java.util.List;

public interface PermissionService {

    Permissions savePermission(Permissions permissions);

    //read
    List<Permissions> fecthPermissionsList();

    //UpdatePermissionson(Permissions permission,Integer permission_id);

    Permissions updatePermission(Permissions permission, Integer permission_id);

    //Delete
    void deletePermissionByid(Integer permission_id);
}

package com.example.admin.Service;

import com.example.admin.modelEntity.Roles;
import com.example.admin.modelEntity.User;

import java.util.List;

public interface RoleService {


    Roles saveRoles(Roles roles);

    //read
    List<Roles> fecthRolesList();

    //Update
    Roles updateRoles(Roles roles,Integer role_id);

    //Delete
    void deleteRolesByid(Integer role_id);
}

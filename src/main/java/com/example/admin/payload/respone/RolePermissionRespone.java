package com.example.admin.payload.respone;


import com.example.admin.modelEntity.Permissions;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolePermissionRespone {

    private  Long  roleId;
    private  String roleName;

    private Long permissionsId;

}

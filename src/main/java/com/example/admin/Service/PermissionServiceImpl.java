package com.example.admin.Service;

import com.example.admin.Repository.PermissionRepository;
import com.example.admin.modelEntity.Permissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl  implements  PermissionService{

    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public Permissions savePermission(Permissions permissions) {
        return permissionRepository.save(permissions) ;
    }

    @Override
    public List<Permissions> fecthPermissionsList() {
        return (List<Permissions>) permissionRepository.findAll() ;
    }

    @Override
    public Permissions updatePermission(Permissions permission, Integer permission_id) {
        return null;
    }

    @Override
    public void deletePermissionByid(Integer permission_id) {

    }
}

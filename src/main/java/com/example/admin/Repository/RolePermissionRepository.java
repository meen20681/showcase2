package com.example.admin.Repository;

import com.example.admin.modelEntity.RolePermissions;
import com.example.admin.modelEntity.User;
import org.springframework.data.repository.CrudRepository;

public interface RolePermissionRepository extends CrudRepository<RolePermissions,Integer> {
}

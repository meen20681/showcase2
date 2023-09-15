package com.example.admin.Repository;

import com.example.admin.modelEntity.Permissions;
import com.example.admin.modelEntity.RolePermissions;
import org.springframework.data.repository.CrudRepository;

public interface PermissionRepository extends CrudRepository<Permissions,Integer> {
}

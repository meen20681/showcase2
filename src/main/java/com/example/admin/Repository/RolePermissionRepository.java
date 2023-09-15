package com.example.admin.Repository;

import com.example.admin.modelEntity.RolePermissions;
import com.example.admin.modelEntity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RolePermissionRepository extends JpaRepository<RolePermissions,Long> {

}

package com.example.admin.Repository;

import com.example.admin.modelEntity.Roles;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Roles,Integer> {
}

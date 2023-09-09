package com.example.admin.Service;

import com.example.admin.Repository.RoleRepository;
import com.example.admin.Repository.UserRepository;
import com.example.admin.modelEntity.Roles;
import com.example.admin.modelEntity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl   implements  RoleService{
    @Autowired
    private RoleRepository roleRepository;





    @Override
    public Roles saveRoles(Roles roles) {
        return roleRepository.save(roles);
    }

    @Override
    public List<Roles> fecthRolesList() {
        return (List<Roles>) roleRepository.findAll();
    }

    @Override
    public Roles updateRoles(Roles roles, Integer role_id) {
        return null;
    }

    @Override
    public void deleteRolesByid(Integer role_id) {
        roleRepository.deleteById(role_id);
    }
}

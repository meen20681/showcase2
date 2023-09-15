package com.example.admin.Service;

import com.example.admin.Repository.RoleRepository;
import com.example.admin.modelEntity.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl   implements  RoleService{
    @Autowired
    private RoleRepository roleRepository;





    @Override
    public Roles saveRoles(Roles roles) {


        return roleRepository.save(roles);
    }


    //// readAll
    @Override
    public List<Roles> fecthRolesList() {

        return (List<Roles>) roleRepository.findAll();
    }

    @Override
    public Roles updateRoles(Roles role, Integer role_id) throws UserNotFoundException {
       Roles existingRoles = roleRepository.findById(role_id)
                .orElseThrow(() -> new UserNotFoundException("Role not found"));

        // Update the user with the new data
        existingRoles.setRoleName(role.getRoleName());


        return roleRepository.save(existingRoles);
    }

    @Override
    public void deleteRolesByid(Integer role_id) throws UserNotFoundException {

        roleRepository.deleteById(role_id);
    }
}

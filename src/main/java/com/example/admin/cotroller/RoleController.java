package com.example.admin.cotroller;

import com.example.admin.Service.RoleService;
import com.example.admin.Service.UserNotFoundException;
import com.example.admin.modelEntity.Roles;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/admin")
public class RoleController {

    private RoleService roleService;

    @GetMapping("/roles")
    public List<Roles> fetchUserList()
    {
        return roleService.fecthRolesList();
    }


    @PutMapping("/roles/{roles_id}")
    public ResponseEntity<Roles> updateUser(@PathVariable Integer role_id, @RequestBody Roles roles) throws UserNotFoundException {
        Roles updated = roleService.updateRoles(roles, role_id);
        return ResponseEntity.ok(updated);
    }


    @DeleteMapping("/roles/{roles_id}")
    public String deleteUserById(@PathVariable("roles_id")Integer roles_id) throws UserNotFoundException {

        roleService.deleteRolesByid(roles_id);
        return "Deleted Successfully" ;
    }

}

package com.example.admin.cotroller;

import com.example.admin.Service.PermissionService;
import com.example.admin.modelEntity.Permissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;
    @PostMapping("/Permission")
    public Permissions savePermission(@RequestBody Permissions permissions)  {


        return permissionService.savePermission(permissions);

    }

    /// slect all permission
    @GetMapping("/Permission")
    public List<Permissions> fetchPermissionsList()
    {
        return permissionService.fecthPermissionsList();
    }



}

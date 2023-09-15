package com.example.admin.modelEntity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "rolepermissions")
public class RolePermissions {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name ="role_permission_id")
    private Long rolePermissionId;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles roleId;

    @ManyToOne
    @JoinColumn(name = "permission_id")
    private Permissions permissionId;



}

package com.example.admin.modelEntity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "roles")

public class Roles {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)


@Column(name ="role_id")
    private Long roleId;
    @Column(name ="role_name")
    private String roleName;


}

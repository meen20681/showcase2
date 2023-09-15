package com.example.admin.modelEntity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "permissions")
public class Permissions {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name ="permission_id")
    private Integer permission_id;
    @Column(name ="permission_name")
    private String permission_name;
    @Column(name ="permission_desc")
    private String permission_desc;



}

package com.example.admin.modelEntity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "users_seq", sequenceName = "users_seq")
    @Column(name ="userid")
    private Long userid;

    @Column(name ="username")
    private String username;
    @Column(name ="password")
    private String password;
    @Column(name ="first_name")///// snake case
    public String firstName;
    @Column(name ="last_name")
    public String lastName;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles roleId;




}

package com.example.admin.Repository;

import com.example.admin.modelEntity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Integer> {


    Optional<User> findByUserName(String username);
}

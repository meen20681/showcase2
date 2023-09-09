package com.example.admin.cotroller;

import com.example.admin.Repository.UserRepository;
import com.example.admin.Service.UserNotFoundException;
import com.example.admin.Service.UserService;
import com.example.admin.modelEntity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    private  UserService userService;


    @GetMapping("/users")
    public List<User> fetchUserList()
    {
        return userService.fecthUserList();
    }
    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable Integer userId) throws UserNotFoundException {
        User user = userService.getUserById(userId);

        // Create a DTO (Data Transfer Object) to represent the desired output data
        User userDTO = new User();
        userDTO.setUserid(user.getUserid());
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        userDTO.setFirst_name(user.getFirst_name());


        userDTO.setLast_name(user.getLast_name());
        userDTO.setRole_id(user.getRole_id());

        return ResponseEntity.ok(userDTO);
    }



}

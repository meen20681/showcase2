package com.example.admin.cotroller;

import com.example.admin.Repository.UserRepository;
import com.example.admin.Service.UserNotFoundException;
import com.example.admin.Service.UserService;
import com.example.admin.Service.UsernameAlreadyExistsException;
import com.example.admin.modelEntity.User;
import com.example.admin.payload.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class UserController {

    @Autowired
    private  UserService userService;



    ///  save user
    @PostMapping("/users")
    public User saveUser(@RequestBody User user)  {


        return userService.saveUser(user);

    }



    /// slect all user
    @GetMapping("/users")
    public List<User> fetchUserList()
    {

        return userService.fecthUserList();
    }

    ///// sellect by ID

    @GetMapping("/users/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable Long userid) throws UserNotFoundException {
        User user = userService.getUserById(userid);

        // Create a DTO (Data Transfer Object) to represent the desired output data
       /* User userDTO = new User();
        userDTO.setUserid(user.getUserid());
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        userDTO.setFirst_name(user.getFirst_name());


        userDTO.setLast_name(user.getLast_name());
        userDTO.setRole_id(user.getRole_id());*/

        return ResponseEntity.ok(user);
    }

    /////// update
@PutMapping("/users/{userid}")
    public ResponseEntity<User> updateUser(@PathVariable Long userid, @RequestBody UserRequest userRequest)throws UserNotFoundException {

        User updatedUser = userService.updateUser(userid,userRequest);
        return ResponseEntity.ok(updatedUser);
    }



/////delete

    @DeleteMapping("/users/{userId}")
    public String deleteUserById(@PathVariable("userId")Long userid){

            userService.deleteUserById(userid);
        return "Deleted Successfully" ;
    }

}

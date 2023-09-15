package com.example.admin.Service;
import com.example.admin.modelEntity.User;
import com.example.admin.payload.request.UserRequest;

import java.util.List;

public interface UserService {

    //save
    User saveUser(User user) ;

    //read
    List<User> fecthUserList();


    //Update


    abstract User updateUser(Long userid, UserRequest userRequest) throws UserNotFoundException;

    //Delete
    void deleteUserById(Long userid);

    User getUserById(Long userId) throws UserNotFoundException;


}

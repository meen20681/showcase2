package com.example.admin.Service;
import com.example.admin.modelEntity.User;
import java.util.List;

public interface UserService {

    //save
    User saveUser(User user) throws UsernameAlreadyExistsException;

    //read
    List<User> fecthUserList();

    //Update
    User updateUser(User user, Integer userid,String username , String lastname);

    abstract User updateUser(Integer userid, String username, String lastname) throws UserNotFoundException;

    //Delete
    void deleteUserByid(Integer userid);

    User getUserById(Integer userId) throws UserNotFoundException;
}

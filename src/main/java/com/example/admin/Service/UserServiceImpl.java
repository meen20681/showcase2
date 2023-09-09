package com.example.admin.Service;

import com.example.admin.Repository.UserRepository;
import com.example.admin.modelEntity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl  implements UserService{
    @Autowired
    private UserRepository userRepository;




    //// SRS03: System shall create user profile. input data as below
    //          System shall verify username is not existing in the database.

    public boolean doesUsernameExist(String username){

        Optional<User> existingUser = userRepository.findByUserName(username);
        return existingUser.isPresent();
    }

    /////save

    @Override
    public  User saveUser(User user) throws UsernameAlreadyExistsException {
        if(doesUsernameExist(user.getUsername())){
            throw new UsernameAlreadyExistsException("Username is already taken.");

        }
        return userRepository.save(user);
    }

//read
    @Override
    public List<User> fecthUserList() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User updateUser(User user, Integer userid, String username, String lastname) {
        return null;
    }

    @Override
    public User updateUser(Integer userid, String username, String lastname) throws UserNotFoundException {
        Optional<User> optionalUser =  userRepository.findById(userid);
        if(optionalUser.isPresent()){
            User user = optionalUser.get();
            user.setFirst_name(username);
            user.setLast_name(lastname);

            return userRepository.save(user);
        }else {
            throw new UserNotFoundException("User with ID " + userid + " not found");
        }


    }

    @Override
    public void deleteUserByid(Integer userid) {
         userRepository.deleteById(userid);
    }

    //// getuser : System shall provide to select user from the database by using key ‘user_id’. Output data as below


    public User getUserById(Integer userId) throws UserNotFoundException {
        return userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("User with ID " + userId + " not found"));
    }



}

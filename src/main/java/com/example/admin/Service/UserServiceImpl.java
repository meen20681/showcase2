package com.example.admin.Service;

import com.example.admin.Repository.UserRepository;
import com.example.admin.modelEntity.User;
import com.example.admin.payload.request.UserRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Log4j2
@Service
@RequiredArgsConstructor
public class UserServiceImpl  implements UserService{


    private final UserRepository userRepository;




    //// SRS03: System shall create user profile. input data as below
    //          System shall verify username is not existing in the database.



    /////save

    @Override
    public  User saveUser(User user)  {

        return userRepository.save(user);
    }

//read
    @Override
    public List<User> fecthUserList() {

        return (List<User>) userRepository.findAll();
    }

    ///// read by id
    //// getuser : System shall provide to select user from the database by using key ‘user_id’. Output data as below


    public User getUserById(Long userid) throws UserNotFoundException {
        return userRepository.findById(userid)
                .orElseThrow(() -> new UserNotFoundException("User with ID " + userid + " not found"));
    }

   /* public User getUserById2(Integer userid) throws UserNotFoundException {
        if(userRepository.findById(userid).isPresent()) {
            User user = userRepository.findById(userid).get();
            return user;
        } else {
            throw new UserNotFoundException("User with ID " + userid + " not found");
        }
    }
*/



////update




    ////update
    @Override
    public User updateUser(Long userid, UserRequest userRequest) throws UserNotFoundException {

        log.debug("userid = "+userid);
        Optional<User> optionalUser =  userRepository.findById(userid);

        if(optionalUser.isPresent()){
            User user1 = optionalUser.get();
            user1.setFirstName(userRequest.getFirstName());
            user1.setLastName(userRequest.getLastName());

            user1.setRoleId(optionalUser.get().getRoleId());

            return userRepository.save(user1);
        }else {
            throw new UserNotFoundException("User with ID " + userid + " not found");
        }


    }
//// deleate
    @Override
    public void deleteUserById(Long userid) {


        userRepository.deleteById(userid);
    }




}

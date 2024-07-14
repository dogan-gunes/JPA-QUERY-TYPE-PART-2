package com.dgn.querytypeparttwo.service;

import com.dgn.querytypeparttwo.model.User;
import com.dgn.querytypeparttwo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }


    public User getUserByUserDetailEmail(String email){
        return userRepository.getUserByUserDetailEmail(email);
    }



    public User findUserByUserDetails_Email(String email){
        return userRepository.findUserByUserDetails_Email(email);
    }

}

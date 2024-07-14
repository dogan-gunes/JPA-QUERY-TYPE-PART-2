package com.dgn.querytypeparttwo.controller;

import com.dgn.querytypeparttwo.model.User;
import com.dgn.querytypeparttwo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }
    @GetMapping("/getUserByUserDetailEmail/{email}")
    public ResponseEntity<User> getUserByUserDetailEmail(@PathVariable String email){
        return new ResponseEntity<>(userService.getUserByUserDetailEmail(email),HttpStatus.OK);
    }

    @GetMapping("/findUserByUserDetails_Email/{email}")
    public ResponseEntity<User> findUserByUserDetails_Email(@PathVariable String email){
        return new ResponseEntity<>(userService.findUserByUserDetails_Email(email),HttpStatus.OK);
    }
}

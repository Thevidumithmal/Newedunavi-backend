/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.newEdunavibackend.controller;

import com.example.newEdunavibackend.data.User;
import com.example.newEdunavibackend.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //get all values from user table-----------------------------------------
    @GetMapping(path = "/users")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    //create user part-------------------------------------------------------
    @PostMapping(path = "/users")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    //update user part----------------------------------------------------
    @PutMapping(path = "/users")
    public User updateUser(@RequestBody User urd) {

        return userService.updateUser(urd);
    }

    //delete using user id------------------------------------------------
    @DeleteMapping(path = "/users/{id}")
    public void deleteUserById(@PathVariable int id) {

        userService.deleteUserById(id);
    }
}

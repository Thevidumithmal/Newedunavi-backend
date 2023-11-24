/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.newEdunavibackend.service;

import com.example.newEdunavibackend.data.User;
import com.example.newEdunavibackend.data.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //get all values in user table-------------------------------------------
    public List<User> getAllUser() {
        List<User> user = userRepository.findAll();
        return user;
    }

    //add user part---------------------------------------------------------
    public User addUser(User user) {
        return userRepository.save(user);
    }
    
 
    public User updateUser(User urd) {
        return userRepository.save(urd);
    }
    
     public void deleteUserById (int id){
          userRepository.deleteById(id);
      } 

}

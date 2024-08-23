package com.example.demo.servises;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.exeption.UserNotFoundException;
import com.example.demo.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User getUserById(int id) throws UserNotFoundException {

      return  userRepo.findById(id).orElseThrow(()->new UserNotFoundException("user with  id  "+id +"is not there in database"));
    }

    public List<User> findAllUsersFromDB(){

        return  userRepo.findAll();
    }

    public User insertUserIntoDB(User user){

        return  userRepo.save(user);
    }
}
package com.example.ExcelFileGeneration.service;

import com.example.ExcelFileGeneration.entity.User;
import com.example.ExcelFileGeneration.repository.UserRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;
    @Override
    public void saveUser(User user) {
        userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = userRepo.findAll();
        List<User> allUsers = users.stream()
                .map(user -> {
                    User userDto = new User();
                    BeanUtils.copyProperties(user,userDto);
                    return userDto;
                }).collect(Collectors.toList());
        return allUsers;

    }
}

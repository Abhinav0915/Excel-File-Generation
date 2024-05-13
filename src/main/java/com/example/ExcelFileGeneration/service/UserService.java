package com.example.ExcelFileGeneration.service;

import com.example.ExcelFileGeneration.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public void saveUser(User user);
    List<User> getAllUsers();
}

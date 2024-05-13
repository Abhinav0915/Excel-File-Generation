package com.example.ExcelFileGeneration.controller;


import com.example.ExcelFileGeneration.entity.User;
import com.example.ExcelFileGeneration.service.UserService;
import com.example.ExcelFileGeneration.util.ExcelFileExporter;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Slf4j
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/newUser")
    public String add(@RequestBody User user) {
        userService.saveUser(user);
        return "New User is Added";
    }

    @GetMapping("/exportUsersToExcel")
    public void exportUsersToExcel(HttpServletResponse response) throws IOException, IOException {
        List<User> users = userService.getAllUsers();
        ExcelFileExporter.exportUsersToExcel(response, users);
    }

}

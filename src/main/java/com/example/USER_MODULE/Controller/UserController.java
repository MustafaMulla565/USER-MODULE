package com.example.USER_MODULE.Controller;

import com.example.USER_MODULE.Model.Customer;
import com.example.USER_MODULE.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public Customer createUser(@RequestBody Customer user) {
        return userService.createUser(user);
    }

    @GetMapping("/{username}")
    public Customer getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

    @GetMapping("/getUsers")
    public List<Customer> getAllUsers() {
        return userService.getAllUsers();
    }
}

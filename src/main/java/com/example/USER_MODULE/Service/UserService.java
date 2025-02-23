package com.example.USER_MODULE.Service;





import com.example.USER_MODULE.Model.Customer;
import com.example.USER_MODULE.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Customer createUser(Customer user) {
        return userRepository.save(user);
    }

    public Customer getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public List<Customer> getAllUsers() {
        return userRepository.findAll();
    }
}

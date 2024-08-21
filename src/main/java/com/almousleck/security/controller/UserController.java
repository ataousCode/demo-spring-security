package com.almousleck.security.controller;

import com.almousleck.security.model.User;
import com.almousleck.security.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @GetMapping("/user-id/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userService.findByUserId(id);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.findAll();
    }
}

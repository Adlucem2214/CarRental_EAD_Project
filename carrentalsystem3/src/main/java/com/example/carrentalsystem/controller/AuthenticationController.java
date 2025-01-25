package com.example.carrentalsystem.controller;

import com.example.carrentalsystem.model.LoginRequest;
import com.example.carrentalsystem.model.Role;
import com.example.carrentalsystem.model.User;
import com.example.carrentalsystem.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthService authService;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return authService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        return authService.login(loginRequest.getEmail(), loginRequest.getPassword());
    }
}

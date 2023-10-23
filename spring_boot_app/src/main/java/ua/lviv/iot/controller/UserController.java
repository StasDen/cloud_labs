package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.domain.User;
import ua.lviv.iot.service.UserService;

@RestController
@RequestMapping(value = "/api/non-secure")
public class UserController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserService userService;

    @PostMapping(value = "")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        User newUser = new User();
        newUser.setUsername(user.getUsername());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setPassword(passwordEncoder.encode(user.getPassword()));  // hashing password using BCrypt
        userService.create(newUser);
        return ResponseEntity.ok("New user has been successfully created");
    }
}

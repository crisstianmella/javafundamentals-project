package com.javafundamentals.apiusers.controller;

import com.javafundamentals.apiusers.model.entity.User;
import com.javafundamentals.apiusers.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    // Create a new user

    @PostMapping("/")
    public ResponseEntity<?> create (@RequestBody User user){
        Date now = new Date();
        user.setCreated(now);
        user.setActive(true);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
    }

    // Read an user
    @GetMapping("/{id}")
    public ResponseEntity<?> read (@PathVariable(value = "id") String userId){
        Optional<User> oUser = userService.findById(userId);
        if (!oUser.isPresent()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(oUser);
    }

    // Update an user
    @PutMapping("/{id}")
    public ResponseEntity<?> update (@RequestBody User userData, @PathVariable(value = "id") String userId){
        Optional<User> uUser = userService.findById(userId);
        if (!uUser.isPresent()){
            return ResponseEntity.notFound().build();
        }
        Date now = new Date();
        uUser.get().setNombre(userData.getNombre());
        uUser.get().setCorreo(userData.getCorreo());
        uUser.get().setPassword(userData.getPassword());
        uUser.get().setTelefonos(userData.getTelefonos());
        uUser.get().setModified(now);

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(uUser.get()));
    }

    // Set OFF an user active
    @PutMapping("/down/{id}")
    public ResponseEntity<?> down_user (@PathVariable(value = "id") String userId){
        Optional<User> uUser = userService.findById(userId);
        if (!uUser.isPresent()){
            return ResponseEntity.notFound().build();
        }

        uUser.get().setActive(false);

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(uUser.get()));
    }

    // Set ON an user
    @PutMapping("/up/{id}")
    public ResponseEntity<?> up_user (@PathVariable(value = "id") String userId){
        Optional<User> uUser = userService.findById(userId);
        if (!uUser.isPresent()){
            return ResponseEntity.notFound().build();
        }

        uUser.get().setActive(true);

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(uUser.get()));
    }


    // Delete an user
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete (@PathVariable(value = "id") String userId){
        if (!userService.findById(userId).isPresent()){
            return ResponseEntity.notFound().build();
        }
        userService.deleteById(userId);
        return ResponseEntity.ok().build();
    }

    // Read all users
    @GetMapping("/")
    public Iterable<User> readAll () {
        Iterable<User> users = userService.findAll();
        return users;
    }
}

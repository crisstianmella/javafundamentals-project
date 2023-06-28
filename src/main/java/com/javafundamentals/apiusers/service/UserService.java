package com.javafundamentals.apiusers.service;

import com.javafundamentals.apiusers.model.entity.User;
import com.javafundamentals.apiusers.model.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserService {

    Iterable<User> findAll();

    Page<User> findAll(Pageable pageable);

    Optional<User> findById(String id);

    User save(User user);

    public void deleteById(String id);
}

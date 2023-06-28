package com.javafundamentals.apiusers.model.repository;

import com.javafundamentals.apiusers.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository <User, String> {
}

package com.vision.project.repositories.base;

import com.vision.project.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findById(int id);

    List<User> findAll();

    User findByUsername(String username);
}
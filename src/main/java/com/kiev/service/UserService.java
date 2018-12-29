package com.kiev.service;

import com.kiev.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void save(User user);

    User findById(int id);

    void update(User user);

    void delete(User user);
}
package com.kiev.dao;

import com.kiev.entity.User;

import java.util.List;

public interface UserDao {

    void save(User user);

    User findById(int id);

    void update(User user);

    void delete(User user);

    List<User> findAll();
}
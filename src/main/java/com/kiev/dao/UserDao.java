package com.kiev.dao;

import com.kiev.entity.User;

import java.util.List;

public interface UserDao {

    void save(User user);

    User getById(int id);

    List<User> findAll();

    void delete(int id);

    void update(User user);
}
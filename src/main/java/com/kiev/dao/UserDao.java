package com.kiev.dao;

import com.kiev.entity.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();
}
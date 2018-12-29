package com.kiev.service;

import com.kiev.dao.UserDao;
import com.kiev.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public void save(User user) {
        userDao.save(user);
    }

    public User findById(int id) {
        return userDao.findById(id);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void delete(User user) {
        userDao.delete(user);
    }
}
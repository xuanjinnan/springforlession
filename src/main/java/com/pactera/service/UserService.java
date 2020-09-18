package com.pactera.service;

import com.pactera.dao.UserDao;
import com.pactera.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public String sayHello() {
        return "hello peacter!!";
    }

    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    public void addUser(User user) {
        userDao.addUser(user);
    }

    public void deleteById(Integer id) {
        userDao.deleteById(id);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}

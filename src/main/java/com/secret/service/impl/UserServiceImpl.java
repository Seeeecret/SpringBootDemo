package com.secret.service.impl;


import com.secret.dao.UserDao;
import com.secret.pojo.po.User;
import com.secret.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userdao;

    @Override
    public User getUserByName(String name) {
        return userdao.getUserByName(name);
    }

    @Override
    public int getMoneyByName(String name) {
        return userdao.getMoneyByName(name);
    }

    @Override
    public List<User> getAll() {
        return userdao.getAll();
    }

    @Override
    public boolean deleteUserByName(String name) {
        return userdao.deleteUserByName(name) > 0;
    }

    @Override
    public boolean addUser(User user) {
        return userdao.addUser(user) == 1;
    }

    @Override
    public boolean updateUser(User user) {
        return userdao.updateUser(user) == 1;
    }

    @Override
    public User getUserByID(int ID) {
        return userdao.getUserByID(ID);
    }

    @Override
    public boolean deleteUserByID(int ID) {
        return userdao.deleteUserByID(ID) > 0;
    }

    @Override
    public boolean updateUserMoneyByID(int money, int ID) {
        return userdao.updateUserMoneyByID(money, ID) > 0;
    }
}

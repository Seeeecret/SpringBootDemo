package com.secret.service;

import com.secret.pojo.po.User;

import java.util.List;

public interface UserService {
    public User getUserByName(String name);

    public int getMoneyByName(String name);

    public List<User> getAll();

    public boolean deleteUserByName(String name);

    public boolean addUser(User user);

    public boolean updateUser(User user);

    public User getUserByID(int ID);

    public boolean deleteUserByID(int ID);

    public boolean updateUserMoneyByID(int money, int ID);
}

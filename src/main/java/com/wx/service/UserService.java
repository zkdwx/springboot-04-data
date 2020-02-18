package com.wx.service;

import com.wx.bean.User;

import java.util.List;

public interface UserService {
    public List<User> getUserList();

    public User getUser(int id);

    public void addUser(User user);

    public void deleteUser(int id);

    public void updateUser(User user);
}

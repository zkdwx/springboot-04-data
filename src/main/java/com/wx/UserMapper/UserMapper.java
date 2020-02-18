package com.wx.UserMapper;

import com.wx.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserMapper {
    public List<User> getUserList();

    public User getUser(int id);

    public void addUser(User user);

    public void deleteUser(int id);

    public void updateUser(User user);


}

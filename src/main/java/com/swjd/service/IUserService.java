package com.swjd.service;

import com.swjd.pojo.User;

import java.util.List;

public interface IUserService {
    List<User> selectById(User user);

    void deleteById(int id);

    int add(User user);

    void update(User user);

    User getOne(User user);
}

package com.swjd.dao;

import com.swjd.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IUserMapper {
    List<User> selectById(User user);

    void deleteById(int id);

    int add(User user);

    void update(User user);

    User getOne(User user);
}

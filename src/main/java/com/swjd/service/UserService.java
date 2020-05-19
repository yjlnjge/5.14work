package com.swjd.service;

import com.swjd.dao.IUserMapper;
import com.swjd.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Service
public class UserService implements IUserService{
    @Autowired
    IUserMapper userService;
    @Override
    public List<User> selectById(User id) {
        return userService.selectById(id);
    }

    @Override
    public void deleteById(int id) {
        userService.deleteById(id);
    }

    @Override
    public int add(User user) {
        return userService.add(user);
    }

    @Override
    public void update(User user) {
         userService.update(user);
    }

    @Override
    public User getOne(User user) {
        return userService.getOne(user);
    }


}

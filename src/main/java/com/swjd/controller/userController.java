package com.swjd.controller;

import com.swjd.pojo.User;
import com.swjd.service.IUserService;
import com.swjd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class userController {
    @Autowired
    private UserService userService;
    @RequestMapping("selectById")
    public String selectById(User user, HttpServletRequest request){
        List<User> users2 = userService.selectById(user);
        request.setAttribute("users",users2);
        System.out.println("sbi执行了");
        return  "index";
    }
    @RequestMapping("deleteById")
    public String deleteById(int id,HttpServletRequest request,User user){
        userService.deleteById(id);
        return selectById(user,request);
    }

    @RequestMapping("add")
    public String add(User user,HttpServletRequest request){
        userService.add(user);
        return selectById(null,request);
    }

    @RequestMapping("updateData")
    public String updateChange(User id,HttpServletRequest request){
        User u2 = userService.getOne(id);

        System.out.println(u2);
        request.setAttribute("u3",u2);
        return "update";
    }

    @RequestMapping("update")
    public String update(User user,HttpServletRequest request){
        System.out.println(user+"update");
//        User u = userService.getOne()
        userService.update(user);
        return selectById(null,request);
    }
}

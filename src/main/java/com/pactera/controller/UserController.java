package com.pactera.controller;

import com.pactera.model.RespBean;
import com.pactera.model.User;
import com.pactera.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/all")
    public RespBean findAllUser(){
        List<User> allUser = userService.findAllUser();
        return RespBean.ok("请求成功",allUser);
    }
    @PostMapping("/add")
    public RespBean addUser(@RequestBody User user){
        userService.addUser(user);
        return RespBean.ok("添加成功!");
    }
    @DeleteMapping("/{id}")
    public RespBean deleteById(@PathVariable Integer id){
        userService.deleteById(id);
        return RespBean.ok("删除成功！");
    }
    @PutMapping("/update")
    public RespBean updateUser( @RequestBody User user){
        userService.updateUser(user);
        return RespBean.ok("更新成功！");
    }
}

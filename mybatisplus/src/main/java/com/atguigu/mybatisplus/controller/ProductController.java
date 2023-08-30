package com.atguigu.mybatisplus.controller;

import com.atguigu.mybatisplus.mapper.UserMapper;
import com.atguigu.mybatisplus.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author: dev_guo
 * @Date: 2023/8/29 11:34
 */
@RestController
public class ProductController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/list")
    public Map testSelect(){
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
        Map<String, Object> map = userMapper.selectMapById(1L);
        System.out.println(map);
        return map;
    }
}

package com.tfswufe.edu.service;

import com.tfswufe.edu.domain.User;

import java.util.List;

public interface UserService {
    //查询所有用户
    public List<User> findAll();

    //保存账户信息
    public void saveUser(User user);
}

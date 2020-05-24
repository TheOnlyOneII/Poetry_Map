package com.tfswufe.edu.service.Impl;

import com.tfswufe.edu.dao.UserDao;
import com.tfswufe.edu.domain.User;
import com.tfswufe.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        System.out.println("Service业务层：查询所有账户...");
        return null;
    }

    @Override
    public void saveUser(User user) {
//调用service中的saveAccount(account)方法
        userDao.saveUser(user);
        System.out.println("Service业务层：保存帐户...");
    }
}

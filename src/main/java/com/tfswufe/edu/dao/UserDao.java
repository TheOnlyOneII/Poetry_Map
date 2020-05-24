package com.tfswufe.edu.dao;

import com.tfswufe.edu.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //此注解代表这是一个持久层，用法类似@controller、@service
public interface UserDao {
    @Select("select * from account")
    public List<User> findAll();
    @Insert("insert into account (name,money) value(#{name},#{money})")
    public void saveUser(User user);
}

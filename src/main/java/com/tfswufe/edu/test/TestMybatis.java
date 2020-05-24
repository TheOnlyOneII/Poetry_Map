package com.tfswufe.edu.test;

import com.tfswufe.edu.dao.UserDao;
import com.tfswufe.edu.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

public class TestMybatis {
    @Test
    public void run1() throws IOException {
        User user =new User();
        user.setUser_name("杜永蓝");
        String uuid = UUID.randomUUID().toString().replace("-","").toUpperCase();
        user.setUser_id(uuid);
        user.setUser_password("123");
        System.out.println(uuid);
        // 加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        UserDao userDao = session.getMapper(UserDao.class);

        // 保存
        userDao.saveUser(user);

        // 提交事务
        session.commit();

        // 关闭资源
        session.close();
        inputStream.close();
    }

    @Test
    public void run2() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = factory.openSession();

        UserDao userDao = session.getMapper(UserDao.class);

        List<User> list = userDao.findAll();
        for (User user: list ) {
            System.out.println(user);
        }

        session.close();
        inputStream.close();
    }
}

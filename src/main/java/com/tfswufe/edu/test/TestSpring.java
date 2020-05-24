package com.tfswufe.edu.test;

import com.tfswufe.edu.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void run1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("UserService");
        userService.findAll();
    }
}

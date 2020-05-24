package com.tfswufe.edu.controller;

import com.tfswufe.edu.domain.User;
import com.tfswufe.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class UserController {

    @Autowired  //按类型注入
    private UserService userService;

    @RequestMapping("/user/findAll")
    public String findAll(Model model) {
        System.out.println("Controller表现层：查询所有账户...");
        // 调用service的方法
        List<User> list = userService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/account/save")
    public void save(User user, HttpServletRequest request, HttpServletResponse response) throws IOException, IOException {
        userService.saveUser(user);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }

}

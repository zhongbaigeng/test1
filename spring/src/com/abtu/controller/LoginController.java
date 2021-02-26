package com.abtu.controller;

import com.abtu.entity.User;
import com.abtu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 12522
 */
@Controller()
@RequestMapping("/index")
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        User user = userService.findByUsernameAndPwd(username, password);
        if (user != null) {
            return "forward:/index/show";
        } else {
            model.addAttribute("errorMsg", "用户名或密码错误");
            return "login";
        }

    }
}

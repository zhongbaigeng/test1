package com.abtu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author 12522
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(path = "/welcome")
    public String welcome() {

        return "login";
    }
}

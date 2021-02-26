package com.abtu.controller;

import com.abtu.dao.LogDao;
import com.abtu.entity.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 12522
 */
@Controller
@RequestMapping("/index")
public class ShowController {
    @RequestMapping("/show")
    public String show(Model model) {
        String filePath = "C:\\Users\\12522\\Desktop\\学生成绩表.xlsx";
        LogDao logDao = new LogDao();
        List<Log> logList = logDao.findAll(filePath);
        model.addAttribute("logList", logList);
        return "main";
    }
}

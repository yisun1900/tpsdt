package com.sh.tpsdt.controller;

import com.sh.tpsdt.service.ValidateCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @program: tpsdt
 * @description: 主页面
 * @author: yi.sun
 * @create: 2019-03-07 11:32
 **/
@RestController
public class IndexController {

    @Autowired
    private ValidateCommandService validateCommandService;

    @RequestMapping("/index")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @PostMapping("/validate")
    public List<String> validate(@RequestBody String command) {
        return validateCommandService.validateCommand(command);
    }
}

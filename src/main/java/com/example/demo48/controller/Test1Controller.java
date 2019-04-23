package com.example.demo48.controller;

import com.example.demo48.entity.User;
import com.example.demo48.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test1")
public class Test1Controller {

    @Resource
    private UserService userService;

    @RequestMapping("/zeroException")
    int zeroException() {
        return 100/0;
    }

    /**
     * 保存数据
     * @return
     */
    @RequestMapping(value = "/save")
    String save() {
        User user = new User();
        user.setName("test01");
        userService.save(user);
        return "ok";
    }


}

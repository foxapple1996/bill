package com.zfoxapple.jxtm.controller;

import com.alibaba.fastjson.JSONObject;
import com.zfoxapple.jxtm.model.User;
import com.zfoxapple.jxtm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/login")
    @ResponseBody
    public String Login(@RequestBody User user){
        System.out.println(user.getPassword());
        Map<String, Object> map = new HashMap<>();
        map.put("id", "500");
        map.put("rid", "0");
        map.put("username", "123");
        map.put("mobile", "123");
        map.put("email", "123@qq.com");
        map.put("token", "fadfasdfasd");
        Map<String, Object> mm = new HashMap<>();
        mm.put("msg", "登陆成功");
        mm.put("status", 200);
        map.put("meta", mm);
        System.out.println(userService.queryUser("root", "123").getUsername());
        return JSONObject.toJSONString(map);
    }
}

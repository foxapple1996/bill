package com.zfoxapple.jxtm.service.impl;

import com.zfoxapple.jxtm.mapper.UserMapper;
import com.zfoxapple.jxtm.model.User;
import com.zfoxapple.jxtm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @Autowired
    UserServiceImpl(UserMapper userMapper){
        this.userMapper = userMapper;
    }


    @Override
    public User queryUser(String username, String pwd) {
        return userMapper.queryUser();
    }
}

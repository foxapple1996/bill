package com.zfoxapple.jxtm.service;

import com.zfoxapple.jxtm.model.User;

public interface UserService {

    User queryUser(String username, String pwd);
}

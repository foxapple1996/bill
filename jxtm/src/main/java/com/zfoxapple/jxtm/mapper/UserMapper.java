package com.zfoxapple.jxtm.mapper;

import com.zfoxapple.jxtm.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User queryUserByPassword(String username, String password);
    User queryUser();
}

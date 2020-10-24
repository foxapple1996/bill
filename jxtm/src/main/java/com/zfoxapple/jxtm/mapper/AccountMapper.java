package com.zfoxapple.jxtm.mapper;

import com.zfoxapple.jxtm.model.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {
    List<Account> queryAllAccount();
}

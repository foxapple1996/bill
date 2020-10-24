package com.zfoxapple.jxtm.service.impl;

import com.zfoxapple.jxtm.mapper.AccountMapper;
import com.zfoxapple.jxtm.model.Account;
import com.zfoxapple.jxtm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountMapper accountMapper;

    @Autowired
    public AccountServiceImpl(AccountMapper accountMapper){
        this.accountMapper = accountMapper;
    }

    @Override
    public List<Account> queryAllAccount() {
        return accountMapper.queryAllAccount();
    }
}

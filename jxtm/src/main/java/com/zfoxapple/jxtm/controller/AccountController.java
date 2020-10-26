package com.zfoxapple.jxtm.controller;

import com.alibaba.fastjson.JSON;
import com.zfoxapple.jxtm.model.Account;
import com.zfoxapple.jxtm.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/account")
@Api(value = "账号管理")
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }


    @RequestMapping(value = "/getAllAccount", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "获取所有账号信息")
    public String getAllAccount(){
        List<Account> lists = accountService.queryAllAccount();
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> ma = new HashMap<>();
        ma.put("pageNum", 1);
        ma.put("total", lists.size());
        ma.put("accounts", lists);
        Map<String, Object> mm = new HashMap<>();
        mm.put("msg", "获取账号列表成功");
        mm.put("status", 200);
        map.put("data", ma);
        map.put("meta", mm);
        return JSON.toJSONString(map);
    }
}

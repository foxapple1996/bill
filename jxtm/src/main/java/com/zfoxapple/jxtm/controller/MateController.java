package com.zfoxapple.jxtm.controller;

import com.alibaba.fastjson.JSON;
import com.zfoxapple.jxtm.service.MateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;

@Controller
@RequestMapping("/api/mate")
@Api(value = "材料管理")
public class MateController {
    private final MateService mateService;

    @Autowired
    public MateController(MateService mateService) {
        this.mateService = mateService;
    }

    @RequestMapping(value = "/getAllMate", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "获取所有材料信息")
    public String getAllMate(){
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
//        System.out.println(sdf.format(mateService.queryAllMate().getmDate()));
        return mateService.queryAllMate().getmDate().toString();

    }
}

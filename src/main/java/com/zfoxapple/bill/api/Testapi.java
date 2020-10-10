package com.zfoxapple.bill.api;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Testapi {

    @ApiOperation(value = "测试数据")
    @GetMapping("/hello")
    public String t1(){
        return "hello world";
    }
}

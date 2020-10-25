package com.zfoxapple.bill;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zfoxapple.jxtm.AppRun;
import com.zfoxapple.jxtm.service.MenuService;
import com.zfoxapple.jxtm.service.impl.MenuServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppRun.class)
public class T1 {

    @Autowired
    MenuService menuService;

    @Test
    public void t1(){
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> mp = new HashMap<>();
        mp.put("msg", "获取菜单列表成功");
        mp.put("status", 200);
        map.put("data", menuService.GetAllMenu());
        map.put("meta", mp);
        System.out.println(JSONObject.toJSONString(map));
    }
}

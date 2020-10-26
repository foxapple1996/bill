package com.zfoxapple.jxtm.controller;

import com.alibaba.fastjson.JSONObject;
import com.zfoxapple.jxtm.service.MenuService;
import com.zfoxapple.jxtm.service.impl.MenuServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/menu")
@Api(value = "获取菜单")
public class MenuController {

    private MenuService menuService;

    @Autowired
    public MenuController(MenuServiceImpl menuService){
        this.menuService = menuService;
    }


    @RequestMapping(value = "/getMenu", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value="获取所有菜单")
    public String getMenu(){
        Map<String, Object> map = new HashMap<>();
        List list3 = menuService.GetAllMenu();
//        Map<String, Object> m1 = new HashMap<>();
//        Map<String, Object> m2 = new HashMap<>();
//        m1.put("id", 101);
//        m1.put("authName", "账号管理");
//        m1.put("path", null);
//        m2.put("id", 201);
//        m2.put("authName", "材料管理");
//        m2.put("path", null);
//        Map<String, Object> m11 = new HashMap<>();
//        Map<String, Object> m21 = new HashMap<>();
//        m11.put("id", 1011);
//        m11.put("authName", "账号列表");
//        m11.put("path", "accountList");
//        m21.put("id", 2011);
//        m21.put("authName", "材料列表");
//        m21.put("path", "mateList");
//        Map<String, Object> m111 = new HashMap<>();
//        Map<String, Object> m222 = new HashMap<>();
//        List<Map<String, Object>> list1 = new ArrayList<>();
//        List<Map<String, Object>> list11 = new ArrayList<>();
//        m11.put("children", list1);
//        m21.put("children", list11);
//        List<Map<String, Object>> list2 = new ArrayList<>();
//        List<Map<String, Object>> list21 = new ArrayList<>();
//        list2.add(m11);
//        list21.add(m21);
//        m1.put("children", list2);
//        m2.put("children", list21);
//        List<Map<String, Object>> list3 = new ArrayList<>();
//        list3.add(m1);
//        list3.add(m2);
        Map<String, Object> mp = new HashMap<>();
        mp.put("msg", "获取菜单列表成功");
        mp.put("status", 200);
        map.put("data", list3);
        map.put("meta", mp);
        return JSONObject.toJSONString(map);
    }
}

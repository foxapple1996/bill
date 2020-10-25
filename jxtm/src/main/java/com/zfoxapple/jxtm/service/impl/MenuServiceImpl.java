package com.zfoxapple.jxtm.service.impl;

import com.mysql.cj.util.StringUtils;
import com.zfoxapple.jxtm.mapper.MenuMapper;
import com.zfoxapple.jxtm.model.Menu;
import com.zfoxapple.jxtm.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MenuServiceImpl implements MenuService {
    private MenuMapper menuMapper;

    @Autowired
    public MenuServiceImpl(MenuMapper menuMapper){
        this.menuMapper = menuMapper;
    }

    @Override
    public List GetAllMenu() {
        List<Menu> rootList = menuMapper.queryAllMenu();
        List<Menu> menuTree = buildMenuTree(rootList, "0");

        return menuTree;
    }


    //利用递归获取数据库中的菜单
    private List<Menu> buildMenuTree(List<Menu> menuList, String pid){
        List<Menu> treeList = new ArrayList<>();
        menuList.forEach(menu -> {
            if(pid.equals(menu.getParentId())){
                menu.setChildren(buildMenuTree(menuList, menu.getmId()));
                treeList.add(menu);
            }
        });
        return treeList;
    }
}

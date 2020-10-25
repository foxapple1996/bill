package com.zfoxapple.jxtm.mapper;

import com.zfoxapple.jxtm.model.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {

    List<Menu> queryAllMenu();
}

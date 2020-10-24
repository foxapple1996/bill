package com.zfoxapple.jxtm.mapper;

import com.zfoxapple.jxtm.model.Mate;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MateMapper {
    Mate queryMate();
}

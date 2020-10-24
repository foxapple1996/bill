package com.zfoxapple.jxtm.service.impl;

import com.zfoxapple.jxtm.mapper.MateMapper;
import com.zfoxapple.jxtm.model.Mate;
import com.zfoxapple.jxtm.service.MateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MateServiceImpl implements MateService {
    private final MateMapper mateMapper;

    @Autowired
    public MateServiceImpl(MateMapper mateMapper) {
        this.mateMapper = mateMapper;
    }

    @Override
    public Mate queryAllMate() {
        return mateMapper.queryMate();
    }
}

package com.zfoxapple.jxtm.mapper;

import com.zfoxapple.jxtm.dto.BillDTO;
import com.zfoxapple.jxtm.model.Bill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BillMapper {
    List<Bill> queryAllBill();
    int insertBill(@Param("bill") BillDTO bill);
}

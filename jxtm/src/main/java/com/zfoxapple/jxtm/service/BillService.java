package com.zfoxapple.jxtm.service;

import com.zfoxapple.jxtm.dto.BillDTO;
import com.zfoxapple.jxtm.model.Bill;

import java.util.List;

public interface BillService {
    List<BillDTO> getAllBill();
    int addBill(BillDTO billDTO);
}

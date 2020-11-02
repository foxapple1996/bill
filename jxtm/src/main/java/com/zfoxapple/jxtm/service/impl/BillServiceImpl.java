package com.zfoxapple.jxtm.service.impl;

import com.zfoxapple.jxtm.dto.BillDTO;
import com.zfoxapple.jxtm.mapper.BillMapper;
import com.zfoxapple.jxtm.model.Bill;
import com.zfoxapple.jxtm.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BillServiceImpl implements BillService {

    private BillMapper billMapper;

    @Autowired
    public BillServiceImpl(BillMapper billMapper){
        this.billMapper = billMapper;
    }

    @Override
    public List<BillDTO> getAllBill(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Bill> lists = billMapper.queryAllBill();
        List<BillDTO> reslist = new ArrayList<>();
        try {
            for (Bill bill : lists) {
                Date tmp = bill.getbDate();
                BillDTO bto = new BillDTO();
                bto.setbId(bill.getbId());
                bto.setbInfo(bill.getbInfo());
                bto.setbMoney(bill.getbMoney());
                if(bill.getbType().equals("1")){
                    bto.setbType("支出");
                }else{
                    bto.setbType("收入");
                }
                bto.setbDate(sdf.format(tmp));
                reslist.add(bto);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return reslist;
    }

    @Override
    public int addBill(BillDTO billDTO) {
        Bill bill = new Bill();
//        bill.setbId();
        return billMapper.insertBill(billDTO);
    }
}

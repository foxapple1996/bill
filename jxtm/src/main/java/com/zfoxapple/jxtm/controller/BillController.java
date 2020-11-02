package com.zfoxapple.jxtm.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zfoxapple.jxtm.dto.BillDTO;
import com.zfoxapple.jxtm.model.Bill;
import com.zfoxapple.jxtm.service.BillService;
import com.zfoxapple.jxtm.utils.Response;
import com.zfoxapple.jxtm.utils.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/api/bill")
@Api(value = "账单相关的接口")
public class BillController {
    private BillService billService;

    public BillController(BillService billService){
        this.billService = billService;
    }

    @RequestMapping(value = "/getAllBill", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation("获取所有的账单")
    public ResponseResult<List<BillDTO>> getAllBill(){
        try{
            List<BillDTO> lists = billService.getAllBill();
            return Response.makeOKRsp(lists);
        }catch (Exception e){
            e.printStackTrace();
            return Response.makeErrRsp("查询账单信息异常");
        }

    }

    @RequestMapping(value = "/addBill", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "增加一条账单记录")
    public ResponseResult<String> addBill(@RequestBody  BillDTO billDTO){
        System.out.println(billDTO);
        billService.addBill(billDTO);
        return Response.makeOKRsp();
    }
}

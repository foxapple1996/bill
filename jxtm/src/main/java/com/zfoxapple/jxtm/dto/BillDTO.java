package com.zfoxapple.jxtm.dto;

public class BillDTO {
    private String bId;
    private String bType;
    private String bMoney;
    private String bDate;
    private String bInfo;

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getbType() {
        return bType;
    }

    public void setbType(String bType) {
        this.bType = bType;
    }

    public String getbMoney() {
        return bMoney;
    }

    public void setbMoney(String bMoney) {
        this.bMoney = bMoney;
    }

    public String getbDate() {
        return bDate;
    }

    public void setbDate(String bDate) {
        this.bDate = bDate;
    }

    public String getbInfo() {
        return bInfo;
    }

    public void setbInfo(String bInfo) {
        this.bInfo = bInfo;
    }

    @Override
    public String toString() {
        return "BillDTO{" +
                "bId='" + bId + '\'' +
                ", bType='" + bType + '\'' +
                ", bMoney='" + bMoney + '\'' +
                ", bDate='" + bDate + '\'' +
                ", bInfo='" + bInfo + '\'' +
                '}';
    }
}

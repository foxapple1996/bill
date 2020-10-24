package com.zfoxapple.jxtm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Mate {
    private int mId;
    private Double tiekuang;
    private Double qianxinkuang;
    private Double xikuang;
    private Double tongkuang;
    private Double yinkuang;
    private Double dahuang;
    private Double gancao;
    private Double qianlixiang;
    private Double chuanbei;
    private Double gouqi;
    private Double wuweizi;
    private Double chongcao;
    private Double shanhu;
    private Double bianhua;
    private Double shaoyao;
    private Double zasui;
    private Double suirou;
    private Double gutou;
    private Double jingrou;
    private Double yurou;
    private Double xue;
    private Double renshen;
    private Double lushui;
    private Double zitan;
    private Double manao;
    private Double baoshi;
    private Double yinlin;
    private Double pengsha;
    private Double chenxiangmu;
    private Double zhubeimu;
    private Double fengwangjiang;
    private Double maoyanshi;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GTM+8")
    private Date mDate;
    private String mServer;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public Double getTiekuang() {
        return tiekuang;
    }

    public void setTiekuang(Double tiekuang) {
        this.tiekuang = tiekuang;
    }

    public Double getQianxinkuang() {
        return qianxinkuang;
    }

    public void setQianxinkuang(Double qianxinkuang) {
        this.qianxinkuang = qianxinkuang;
    }

    public Double getXikuang() {
        return xikuang;
    }

    public void setXikuang(Double xikuang) {
        this.xikuang = xikuang;
    }

    public Double getTongkuang() {
        return tongkuang;
    }

    public void setTongkuang(Double tongkuang) {
        this.tongkuang = tongkuang;
    }

    public Double getYinkuang() {
        return yinkuang;
    }

    public void setYinkuang(Double yinkuang) {
        this.yinkuang = yinkuang;
    }

    public Double getDahuang() {
        return dahuang;
    }

    public void setDahuang(Double dahuang) {
        this.dahuang = dahuang;
    }

    public Double getGancao() {
        return gancao;
    }

    public void setGancao(Double gancao) {
        this.gancao = gancao;
    }

    public Double getQianlixiang() {
        return qianlixiang;
    }

    public void setQianlixiang(Double qianlixiang) {
        this.qianlixiang = qianlixiang;
    }

    public Double getChuanbei() {
        return chuanbei;
    }

    public void setChuanbei(Double chuanbei) {
        this.chuanbei = chuanbei;
    }

    public Double getGouqi() {
        return gouqi;
    }

    public void setGouqi(Double gouqi) {
        this.gouqi = gouqi;
    }

    public Double getWuweizi() {
        return wuweizi;
    }

    public void setWuweizi(Double wuweizi) {
        this.wuweizi = wuweizi;
    }

    public Double getChongcao() {
        return chongcao;
    }

    public void setChongcao(Double chongcao) {
        this.chongcao = chongcao;
    }

    public Double getShanhu() {
        return shanhu;
    }

    public void setShanhu(Double shanhu) {
        this.shanhu = shanhu;
    }

    public Double getBianhua() {
        return bianhua;
    }

    public void setBianhua(Double bianhua) {
        this.bianhua = bianhua;
    }

    public Double getShaoyao() {
        return shaoyao;
    }

    public void setShaoyao(Double shaoyao) {
        this.shaoyao = shaoyao;
    }

    public Double getZasui() {
        return zasui;
    }

    public void setZasui(Double zasui) {
        this.zasui = zasui;
    }

    public Double getSuirou() {
        return suirou;
    }

    public void setSuirou(Double suirou) {
        this.suirou = suirou;
    }

    public Double getGutou() {
        return gutou;
    }

    public void setGutou(Double gutou) {
        this.gutou = gutou;
    }

    public Double getJingrou() {
        return jingrou;
    }

    public void setJingrou(Double jingrou) {
        this.jingrou = jingrou;
    }

    public Double getYurou() {
        return yurou;
    }

    public void setYurou(Double yurou) {
        this.yurou = yurou;
    }

    public Double getXue() {
        return xue;
    }

    public void setXue(Double xue) {
        this.xue = xue;
    }

    public Double getRenshen() {
        return renshen;
    }

    public void setRenshen(Double renshen) {
        this.renshen = renshen;
    }

    public Double getLushui() {
        return lushui;
    }

    public void setLushui(Double lushui) {
        this.lushui = lushui;
    }

    public Double getZitan() {
        return zitan;
    }

    public void setZitan(Double zitan) {
        this.zitan = zitan;
    }

    public Double getManao() {
        return manao;
    }

    public void setManao(Double manao) {
        this.manao = manao;
    }

    public Double getBaoshi() {
        return baoshi;
    }

    public void setBaoshi(Double baoshi) {
        this.baoshi = baoshi;
    }

    public Double getYinlin() {
        return yinlin;
    }

    public void setYinlin(Double yinlin) {
        this.yinlin = yinlin;
    }

    public Double getPengsha() {
        return pengsha;
    }

    public void setPengsha(Double pengsha) {
        this.pengsha = pengsha;
    }

    public Double getChenxiangmu() {
        return chenxiangmu;
    }

    public void setChenxiangmu(Double chenxiangmu) {
        this.chenxiangmu = chenxiangmu;
    }

    public Double getZhubeimu() {
        return zhubeimu;
    }

    public void setZhubeimu(Double zhubeimu) {
        this.zhubeimu = zhubeimu;
    }

    public Double getFengwangjiang() {
        return fengwangjiang;
    }

    public void setFengwangjiang(Double fengwangjiang) {
        this.fengwangjiang = fengwangjiang;
    }

    public Double getMaoyanshi() {
        return maoyanshi;
    }

    public void setMaoyanshi(Double maoyanshi) {
        this.maoyanshi = maoyanshi;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public String getmServer() {
        return mServer;
    }

    public void setmServer(String mServer) {
        this.mServer = mServer;
    }
}

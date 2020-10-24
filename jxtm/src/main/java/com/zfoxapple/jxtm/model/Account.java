package com.zfoxapple.jxtm.model;

public class Account {
    private int cId;
    private String cAccount;
    private String cPassword;
    private String cServer;
    private int cEnergy;

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcAccount() {
        return cAccount;
    }

    public void setcAccount(String cAccount) {
        this.cAccount = cAccount;
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword;
    }

    public String getcServer() {
        return cServer;
    }

    public void setcServer(String cServer) {
        this.cServer = cServer;
    }

    public int getcEnergy() {
        return cEnergy;
    }

    public void setcEnergy(int cEnergy) {
        this.cEnergy = cEnergy;
    }
}

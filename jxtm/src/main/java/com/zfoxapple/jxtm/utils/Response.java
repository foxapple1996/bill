package com.zfoxapple.jxtm.utils;

import java.io.Serializable;

public class Response<T> implements Serializable {

    private static final long serialVersionUID = 7285144287238551716L;

    private static final String successCode = "200";

    private T data;

    private String code;

    private String msg;

    public Response() {
        this.code = successCode;
        this.msg = "请求成功";
    }

    public Response(String code, String msg) {
        this();
        this.code = code;
        this.msg = msg;
    }

    public Response(T data, String code, String msg) {
        this();
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public Response(T data) {
        this();
        this.data = data;
    }
}

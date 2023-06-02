package com.taohan.online.exam.util;

public enum ResponseCode {
    SUCCESS(0, "OK"),
    SERVER_ERROR(1, "server error"),
    BIZ_CODE(10,"除0异常");
    
    private int code;
    private String msg;
    
    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    
    public int getCode() {
        return code;
    }
    
    public ResponseCode setCode(int code) {
        this.code = code;
        return this;
    }
    
    public String getMsg() {
        return msg;
    }
    
    public ResponseCode setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}

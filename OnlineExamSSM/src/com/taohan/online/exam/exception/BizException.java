package com.taohan.online.exam.exception;

import com.taohan.online.exam.util.ResponseCode;

public class BizException extends RuntimeException {
    
    private final int code;
    
    public BizException(ResponseCode errCode) {
        super(errCode.getMsg());
        this.code = errCode.getCode();
    }
    
    public BizException(ResponseCode errCode, String msg) {
        super(msg);
        this.code = errCode.getCode();
    }
    
    public BizException(int code, String msg) {
        super(msg);
        this.code = code;
    }
    
    public int getCode() {
        return this.code;
    }
    
}
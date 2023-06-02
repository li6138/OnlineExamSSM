package com.taohan.online.exam.util;

public class HttpResult
{
    Thread d;
    private Integer code;
    private String message;
    
    public HttpResult()
    {
    }
    
    public HttpResult(Integer code, String message)
    {
        this.code = code;
        this.message = message;
    }
    
    public Integer getCode()
    {
        return code;
    }
    
    public String getMessage()
    {
        return message;
    }
    
    public void setCode(Integer code)
    {
        this.code = code;
    }
    
    public void setMessage(String message)
    {
        this.message = message;
    }
    
    @Override
    public String toString()
    {
        return "HttpResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}

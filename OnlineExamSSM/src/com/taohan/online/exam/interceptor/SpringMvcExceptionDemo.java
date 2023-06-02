package com.taohan.online.exam.interceptor;

import com.taohan.online.exam.exception.BizException;
import com.taohan.online.exam.util.HttpResult;
import com.taohan.online.exam.util.ResponseCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 统一异常处理
 * */
@ControllerAdvice
public class SpringMvcExceptionDemo {
    
    @ResponseBody
    @ExceptionHandler
    public Object exceptionHandler(Exception e, HttpServletRequest request, HttpServletResponse response) {
        if (e instanceof BizException) {
            BizException be = (BizException) e;
            return new HttpResult(be.getCode(), be.getMessage());
        }
        if (e instanceof IllegalArgumentException) {
            return new HttpResult(ResponseCode.SERVER_ERROR.getCode(), e.getMessage());
        }
        
        return new HttpResult(ResponseCode.SERVER_ERROR.getCode(),ResponseCode.SERVER_ERROR.getMsg());
    }
    
}

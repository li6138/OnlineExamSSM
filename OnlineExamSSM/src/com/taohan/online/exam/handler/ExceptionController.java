package com.taohan.online.exam.handler;

import com.taohan.online.exam.exception.BizException;
import com.taohan.online.exam.util.HttpResult;
import com.taohan.online.exam.util.ResponseCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController
{
    @RequestMapping("/test")
    public HttpResult testA()
    {
        throw new BizException(ResponseCode.BIZ_CODE);
    }
}
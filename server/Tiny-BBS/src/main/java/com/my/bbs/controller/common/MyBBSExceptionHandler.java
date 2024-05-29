
package com.my.bbs.controller.common;

import com.my.bbs.util.Result;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;




@RestControllerAdvice
public class MyBBSExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Object handleException(Exception e, HttpServletRequest req) {
        Result result = new Result();
        result.setResultCode(500);

        e.printStackTrace();
        result.setMessage("未知异常");
        //检查请求是否为ajax, 如果是 ajax 请求则返回 Result json串, 如果不是 ajax 请求则返回 error 视图
        String contentTypeHeader = req.getHeader("Content-Type");
        String acceptHeader = req.getHeader("Accept");
        String xRequestedWith = req.getHeader("X-Requested-With");
        if ((contentTypeHeader != null && contentTypeHeader.contains("application/json"))
                || (acceptHeader != null && acceptHeader.contains("application/json"))
                || "XMLHttpRequest".equalsIgnoreCase(xRequestedWith)) {
            return result;
        } else {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("message", e.getMessage());
            modelAndView.addObject("url", req.getRequestURL());
            modelAndView.addObject("stackTrace", e.getStackTrace());
            modelAndView.addObject("author", "AUTHOR");
            modelAndView.addObject("ltd", "My BBS");
            modelAndView.setViewName("error");
            return modelAndView;
        }
    }
}

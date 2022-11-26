package com.iamgovindthakur.interceptor.interceptor;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.Collections;

@Component
@Log4j2
public class ReqInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        log.info("\n<============= preHandle() BEGIN=============>\n");
        Collections.list(request.getHeaderNames()).forEach(header -> System.out.println(header + " : " + request.getHeader(header)));
        log.info("\n<============= preHandle() END=============>\n");
        return true;
    }
}

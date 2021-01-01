package com.tommy.why.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(" MyInterceptor.preHandle------ ");
        String loginName = "";
        Object attr = request.getSession().getAttribute("name");
        if(attr != null){
            loginName = (String)attr;
        }
        if(!"tommy".equals(loginName)){
            request.getRequestDispatcher("/tips.jsp").forward(request,response);
            return false;
        }

        return true;
    }

//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        System.out.println(" MyInterceptor.postHandle------ ");
//
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        System.out.println(" MyInterceptor.afterCompletion------ ");
//
//    }
}

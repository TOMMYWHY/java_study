package com.tommy.why.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebFilter(urlPatterns = "/api/*",filterName = "myfilter")
@Order(1)
public class Myfilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("》》》》》》》 filter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request1 = (HttpServletRequest) request;
        HttpServletResponse response1 = (HttpServletResponse) response;
        String uri = request1.getRequestURI();
        String method = request1.getMethod();
        System.out.println(">>>> uri:"+uri + " method : "+method);
        chain.doFilter(request,response);

    }

    @Override
    public void destroy() {
        System.out.println("》》》》》》》 filter destroy");
    }
}

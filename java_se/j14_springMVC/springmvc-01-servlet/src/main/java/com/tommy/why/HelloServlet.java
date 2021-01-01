package com.tommy.why;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //todo
        String method = req.getParameter("method");
        if(method.equals("add")){
            req.getSession().setAttribute("msg","adding....");
        }
        if(method.equals("delete")){
            req.getSession().setAttribute("msg","deleting....");
        }

        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req,resp);

    }
}


package cookieDemo;

import javax.servlet.http.Cookie;
import java.io.IOException;

@javax.servlet.annotation.WebServlet("/cookieDemo1")
public class CookieServletDemo extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Cookie c = new Cookie("msg", "hello");
        response.addCookie(c);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request,response);
    }
}

package cookie;

import javax.servlet.http.Cookie;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@javax.servlet.annotation.WebServlet(  "/cookieServletDemo1")
public class CookieServletDemo1 extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        Cookie[] cookies = request.getCookies();
        boolean flag = false;
        if(cookies !=null && cookies.length>0){
            for (Cookie cookie:
                 cookies) {
                String name = cookie.getName();
                if("lastTime".equals(name)){
                    flag = true;
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
                    String str_date = sdf.format(date);
                    cookie.setValue(str_date);
                    response.addCookie(cookie);
                    cookie.setMaxAge(60*60*24*30);

                    String value = cookie.getValue();
                    response.getWriter().write("<h1>welcome back,the last time:"+value+"</h1>");
                    break;
                }

            }
        }
        if (cookies==null  || cookies.length==0 || flag==false){
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String str_date = sdf.format(date);
            Cookie cookie = new Cookie("lastTime",str_date);
            cookie.setMaxAge(60*60*24*30);
            response.addCookie(cookie);
            response.getWriter().write("<h1>welcome first visit ~!</h1>");
        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request,response);
    }
}

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/downloadServlet")
public class DownloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String filename = request.getParameter("filename");
        ServletContext servletContext = this.getServletContext();
        String realPath = servletContext.getRealPath("/img/" + filename);
        FileInputStream fis = new FileInputStream(realPath);
        System.out.println(fis);

        String mimeType = servletContext.getMimeType(filename);
        response.setHeader("content-type",mimeType);
        response.setHeader("content-disposition","attachment;filename="+filename);

        ServletOutputStream sos = response.getOutputStream();
        byte[] buff = new byte[1024*8];
        int len = 0;

        while ((len = fis.read(buff) ) != -1){
            sos.write(buff,0,len);
        }
        fis.close();


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}

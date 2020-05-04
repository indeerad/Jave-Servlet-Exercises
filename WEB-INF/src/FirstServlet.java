import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet{
    public void destroy(){}

    public ServletConfig getServletConfig(){
        return null;
    }
	
	public String getServletInfo(){
        return null;
    }

    public void init(ServletConfig config){}

    public void service(ServletRequest req, ServletResponse res)
        throws ServletException, IOException{

            res.getWriter().print("<h1>Welcome</h1>");
    }
}
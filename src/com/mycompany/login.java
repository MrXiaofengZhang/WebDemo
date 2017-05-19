package com.mycompany;

import jdk.nashorn.internal.ir.debug.JSONWriter;
import org.codehaus.jackson.map.util.JSONPObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by zxf on 2017/5/11.
 */
@WebServlet(name = "login")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\">");
        out.println("<title>Login!</title>");
        out.println("</head>");
        out.println("<body>");





            String username =  request.getParameter("username");
            String passworld = request.getParameter("password");
            if (username==null||username.isEmpty()){
                out.println("<h1>Login Field!</h1>");
                out.println(String.format("<p>用户名为空</p>"));
            }
            else if (passworld.isEmpty()||passworld==null){
                out.println("<h1>Login Field!</h1>");
                out.println("<p>密码为空</p>");
            }
        else {
                out.println("<h1>Login Successuful!</h1>");
                out.println(String.format("<p>用户名:%s</p>", request.getParameter("username")));
                out.println(String.format("<p>密码:%s</p>", request.getParameter("password")));
            }


        out.println("</body>");
        out.println("</html>");


    }
}

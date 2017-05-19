package com.mycompany;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import DAO.ConnectionSQL;
import com.google.gson.*;

/**
 * Created by zxf on 2017/5/11.
 */
@WebServlet(name = "Register")
public class Register extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

      boolean flag = DAO.ConnectionSQL.registerUser(username,password);
        if (flag ){
            JsonObject json = new JsonObject();
            json.addProperty("status_code",0);
            json.addProperty("status_message","注册成功");
            json.addProperty("data","");


        }
        else {
            JsonObject json = new JsonObject();
            json.addProperty("status_code",1);
            json.addProperty("status_message","注册失败");
            json.addProperty("data","");
            System.out.println(json);
        }
    }
}

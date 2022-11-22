package com.liang.controller.Login;

import com.liang.service.imp.UserImplementation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Beyond
 * @date 2022/11/17
 */
@WebServlet("/login")
public class UserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setHeader("Access-Control-Allow-Origin","*");
//        resp.setHeader("'Access-Control-Allow-Method","POST,GET");
//        resp.setCharacterEncoding("UTF-8");
//        resp.setContentType("application/json; charset=utf-8");
//
//        UserImplementation userImplementation = new UserImplementation();
//        resp.setStatus(200);
//        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Access-Control-Allow-Origin",req.getHeader("Origin"));
        resp.setHeader("Access-Control-Allow-Credentials", "true");
        resp.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
        resp.addHeader("Access-Control-Allow-Headers",req.getHeader("Access-Control-Request-Headers") );
        resp.addHeader("Access-Control-Max-Age", "120");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json; charset=utf-8");
        UserImplementation userImplementation = new UserImplementation();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
//        System.out.println(username+":"+password);
        String line = null;
        BufferedReader reader = req.getReader();
        System.out.println(reader);
        while ((line=reader.readLine()) !=null){
            System.out.println(line);
        }
        resp.setStatus(200);
    }
}

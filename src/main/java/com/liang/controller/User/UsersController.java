package com.liang.controller.User;

import com.google.gson.Gson;
import com.liang.pojo.Users;
import com.liang.service.imp.UserImplementation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author Beyond
 * @date 2022/11/22
 */
@WebServlet("/users")
public class UsersController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Access-Control-Allow-Origin",req.getHeader("Origin"));
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json; charset=utf-8");
        UserImplementation userImplementation = new UserImplementation();
        List<Users> userList = userImplementation.selectUser();
        System.out.println(userList);
        Gson gson = new Gson();
        String s = gson.toJson(userList);
        System.out.println(s);
        PrintWriter out = resp.getWriter();
        out.write(s);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

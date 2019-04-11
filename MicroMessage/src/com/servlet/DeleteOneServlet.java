package com.servlet;

import com.service.MaintainService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 单条删除控制层
 */

@WebServlet(name = "DeleteOneServlet")
public class DeleteOneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码
        request.setCharacterEncoding("UTF-8");
        //接受页面的值
        String id=request.getParameter("id");
        MaintainService maintainService=new MaintainService();
        maintainService.deleteOne(id);
        //向页面跳转
        request.getRequestDispatcher("/List.action").forward(request,response);
    }
}

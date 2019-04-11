package com.servlet;

import com.service.QueryService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ListServlet")
public class ListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            //设置编码
            request.setCharacterEncoding("UTF-8");
            //接受页面的值
            String command=request.getParameter("command");
            String description=request.getParameter("description");
            //向页面传值
            request.setAttribute("command",command);
            request.setAttribute("description",description);
            QueryService queryService=new QueryService();
            //查询消息列表并传给页面
            request.setAttribute("messageList",queryService.queryMessageList(command,description));
            //向页面跳转
            request.getRequestDispatcher("/WEB-INF/jsp/back/list.jsp").forward(request,response);
    }
}

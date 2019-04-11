<%--
  Created by IntelliJ IDEA.
  User: moses.mze
  Date: 2019-04-02
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <%= basePath%>
  <%= path%>
  ${pageContext.request.contextPath}
  <form action="${pageContext.request.contextPath}/List.action">
      <input type="submit" value="这是测试">
  </form>
  </body>
</html>

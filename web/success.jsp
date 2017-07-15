<%--
  Created by IntelliJ IDEA.
  User: dll
  Date: 2017/7/15
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
===============el表达式获取数据=============<br/>
    ${name}
    ${password}<br/>
===============struts2标签获取数据===========<br/>
<s:property value="password"/><%--值栈中获取--%><br/>
<s:property value="#request.password"/><%--栈的上下文中获取--%><br/>
<s:property value="#attr.password"/><br/>
<s:debug></s:debug>
</body>
</html>

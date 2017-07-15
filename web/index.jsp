<%--
  Created by IntelliJ IDEA.
  User: dll
  Date: 2017/7/15
  Time: 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="user/login" method="post">
    <table>
      <tr>
        <td>用户名：</td>
        <td><input  type="text" name="name"/></td>
      </tr>
      <tr>
        <td>密码：</td>
        <td><input  type="password" name="password"/></td>
      </tr>
      <tr>
        <td></td>
        <td><input  type="submit" value="登录"/></td>
      </tr>
    </table>
  </form>
  </body></html>

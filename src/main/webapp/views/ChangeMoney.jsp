<%--
  Created by IntelliJ IDEA.
  User: MR. NEN
  Date: 12/9/2022
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>${name}</h3>
<form action="<%=request.getContextPath()%>/MoneyChangeController/trans" method="get">
  <input type="text" name="usd" placeholder="USD" value="${usd}">
  <input type="text" name="vnd" placeholder="VND" value="${vnd}" >
  <input type="submit" value="trans">
</form>
</body>
</html>

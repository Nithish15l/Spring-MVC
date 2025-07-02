<%--
  Created by IntelliJ IDEA.
  User: Nithish
  Date: 01-07-2025
  Time: 07:21 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Response Page</title>
</head>
<body>
<h1>Display data from Array</h1>
    <b>FREE BOOKS</b>
    <c:forEach var="b" items="${books}">${b} </c:forEach>
</body>
</html>

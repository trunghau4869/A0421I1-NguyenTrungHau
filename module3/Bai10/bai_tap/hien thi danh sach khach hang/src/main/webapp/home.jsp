<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 10/31/2021
  Time: 1:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


    <h1>
        Danh Sách Khách Hàng
    </h1>
    <table border="1px solid" style="border-collapse:collapse;padding: 15px 10px ">
    <tr>
        <td>Tên</td>

        <td>Ngày Sinh</td>

        <td>Địa Chỉ</td>

        <td>Ảnh</td>

    </tr>
    <c:forEach items="${list}" var="customers">
    <tr>
        <td >${customers.name}</td>

        <td>${customers.date}</td>

        <td>${customers.address}</td>

        <td>${customers.image}</td>

    </tr>
    </c:forEach>
    </table>
</body>
</html>

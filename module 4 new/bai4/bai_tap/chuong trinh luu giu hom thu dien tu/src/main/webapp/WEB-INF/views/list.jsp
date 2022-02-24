<%--
  Created by IntelliJ IDEA.
  User: Nhokh
  Date: 2/23/2022
  Time: 12:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>List Email</title>
</head>
<body>
<h1 class="text-center">List Email</h1>
<div class="container">
    <table class="table">
        <thead class="table-dark">
        <tr>
            <th>
                language
            </th>
            <th>
                pageSize
            </th>
            <th>
                spamsFilter
            </th>
            <th>
                signature
            </th>
            <th>View</th>
            <th>Edit</th>
        </tr>
        </thead>
        <c:forEach items="${emails}" var="email">
            <tbody>
            <tr>
                <td>${email.language}</td>
                <td>${email.pageSize}</td>
                <td>${email.spamsFilter}</td>
                <td>${email.signature}</td>
                <td>
                    <a href="/email/{id}/edit(id=${emails.getId()})">edit</a>
                </td>

                <td><a href="#">view</a>
                </td>
                <td><a href="#">edit</a></td>
            </tr>
            </tbody>
        </c:forEach>
    </table>
</div>
</body>
</html>

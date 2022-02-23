<%--
  Created by IntelliJ IDEA.
  User: Nhokh
  Date: 2/21/2022
  Time: 10:32 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <h1>EMAIL</h1>
</head>
<body>
<form:form action="/create" method="post" modelAttribute="email">
    <table class="table table-striped">

        <tr>
            <td>
                language
            </td>
            <td><form:input path="language"/></td>
        </tr>
        <tr>
            <td>
                pageSize
            </td>
            <td><form:input path="pageSize"/></td>
        </tr>
        <tr>
            <td>
                spamsFilter
            </td>
            <td><form:input path="spamsFilter"/></td>
        </tr>
        <tr>
            <td>
                signature
            </td>
            <td><form:input path="signature"/></td>
        </tr>

    </table>
</form:form>
</body>
</html>

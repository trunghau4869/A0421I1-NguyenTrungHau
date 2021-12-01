<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 11/15/2021
  Time: 1:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css2?family=Chewy&family=Lobster&family=Luckiest+Guy&family=Yuji+Boku&display=swap" rel="stylesheet">
    <title>$Title$</title>
    <style>
        .logo {
            height: 75px;
            background-color: gray;
        }

        img {
            margin-left: 40px;
            margin-top: 20px;
            height: 34px;
            width: 50px;
        }

        .sidebar {
            padding: 15px;
            background-color: #cdcdcd;
        }

        footer {
            height: 80px;
            color: #fff;
            background: gray;
            margin-bottom: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            text-align: center;
            text-shadow: 5px 5px 5px #000;
            position: fixed;
            width: 100%;
        }

        .content {
            min-height: 70vh;
            background: linear-gradient(45deg, red, blue);
            color: #fff;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .sidebar>a {
            text-decoration: none;
            color: #000;
        }
    </style>
</head>

<body>
<svg xmlns="http://www.w3.org/2000/svg" style="display: none;">
    <symbol id="check-circle-fill" fill="currentColor" viewBox="0 0 16 16">
        <path d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0zm-3.97-3.03a.75.75 0 0 0-1.08.022L7.477 9.417 5.384 7.323a.75.75 0 0 0-1.06 1.06L6.97 11.03a.75.75 0 0 0 1.079-.02l3.992-4.99a.75.75 0 0 0-.01-1.05z"/>
    </symbol>
</svg>
<div class="logo">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">
            <img src="https://v5.getbootstrap.com/docs/5.0/assets/brand/bootstrap-logo-shadow.png" alt="">
        </a>
    </div>
</div>

<c:if test="${mess!=null}">

    <div class="alert alert-success d-flex align-items-center" role="alert">
        <svg class="bi flex-shrink-0 me-2" width="24" height="24" role="img" aria-label="Success:"><use xlink:href="#check-circle-fill"/></svg>
        <div>
                ${mess}
        </div>
    </div>

</c:if>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="addEmployee.jsp">Employee</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="addCustomer.jsp">Customer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="addService.jsp">Service</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="addContract.jsp">Contract</a>
                </li>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>

<div class="container-fluid article">
    <div class="row">
        <div class="col-3 sidebar">
            <p>
                <a href="listCustomer1.jsp">list</a>
            </p>
            <p>Item Two</p>
            <p>Item Three</p>
        </div>
        <div class="col-9 content">

            <table id="page" class="table table-dark">
                <tr>
                    <th scope="col">id</th>
                    <th scope="col">name</th>
                    <th scope="col">birthday</th>
                    <th scope="col">gender</th>
                    <th scope="col">id_card</th>
                    <th scope="col">phone</th>
                    <th scope="col">email</th>
                    <th scope="col">type_id</th>
                    <th scope="col">address</th>
                    <th scope="col">update</th>
                </tr>
                <c:forEach items="${customerList}" var="customer" varStatus="status">
                    <tr>
                        <td>${customer.customer_id}</td>
                        <td>${customer.customer_name}</td>
                        <td>${customer.customer_birthday}</td>
                        <td>
                            <c:if test="${customer.customer_gender}">
                                <sp>Male</sp>
                            </c:if>
                            <c:if test="${!customer.customer_gender}">
                                <sp>Female</sp>
                            </c:if>
                        </td>
                        <td>${customer.customer_id_card}</td>
                        <td>${customer.customer_phone}</td>
                        <td>${customer.customer_email}</td>
                        <td>${customer.customer_type_id}</td>
                        <td>${customer.customer_address}</td>
                        <td><a href="/customer?action=edit&id=${customer.customer_id}" class="btn btn-success">Edit</a></td>
                    </tr>
                </c:forEach>

            </table>

        </div>
    </div>
</div>
<footer>
    <h3>Make By PennyWise</h3>
</footer>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script>
    $(document).ready(function () {
        $('#page').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        })
    })
</script>
</body>

</html>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 11/14/2021
  Time: 10:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css2?family=Chewy&family=Lobster&family=Luckiest+Guy&family=Yuji+Boku&display=swap"
          rel="stylesheet">
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
    </style>
</head>

<body>
<div class="logo">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">
            <img src="https://v5.getbootstrap.com/docs/5.0/assets/brand/bootstrap-logo-shadow.png" alt="">
        </a>
    </div>
</div>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
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
            <div class="container">
                <form class="row g-3" action="/customer?action=add" method="post">
                    <div class="col-md-6">
                        <label for="customer_id" class="form-label">customer_id</label>
                        <input type="text" class="form-control" id="customer_id" name="customer_id">
                    </div>
                    <div class="col-md-6">
                        <label for="customer_name" class="form-label">customer_name</label>
                        <input type="text" class="form-control" id="customer_name" name="customer_name">
                    </div>

                    <div class="col-12 d-flex">
                        <label class="form-label col-md-4">customer_gender</label>

                        <div class="form-check col-md-4">
                            <input class="form-check-input" type="radio" name="customer_gender" id="flexRadioDefault1"
                                   value="1">
                            <label class="form-check-label" for="flexRadioDefault1">
                                Male
                            </label>
                        </div>
                        <div class="form-check col-md-4">
                            <input class="form-check-input" type="radio" name="customer_gender" id="flexRadioDefault2"
                                   value="0" checked>
                            <label class="form-check-label" for="flexRadioDefault2">
                                Female
                            </label>
                        </div>

                    </div>
                    <div class="col-md-6">
                        <label for="customer_birthday" class="form-label">customer_birthday</label>
                        <input type="date" class="form-control" id="customer_birthday" name="customer_birthday">
                    </div>

                    <div class="col-md-6">
                        <label for="customer_id_card" class="form-label">customer_id_card</label>
                        <input type="text" class="form-control" id="customer_id_card" name="customer_id_card">
                    </div>
                    <div class="col-md-6">
                        <label for="customer_phone" class="form-label">customer_phone</label>
                        <input type="text" class="form-control" id="customer_phone" name="customer_phone">
                    </div>

                    <div class="col-md-6">
                        <label for="customer_email" class="form-label">customer_email</label>
                        <input type="text" class="form-control" id="customer_email" name="customer_email">
                    </div>
                    <div class="col-md-6">
                        <label for="customer_type_id" class="form-label">customer_type_id</label>
                        <select id="customer_type_id" class="form-select" name="customer_type_id">
                            <option value="0">--Chọn loại Customer--</option>
                            <option value="1">--Diamond--</option>
                            <option value="2">--platinum--</option>
                            <option value="3">--Gold--</option>
                            <option value="4">--Silver--</option>
                            <option value="5">--Member--</option>
                        </select>
                    </div>
                    <div class="col-md-6">
                        <label for="customer_address" class="form-label">customer_address</label>
                        <input type="text" class="form-control" id="customer_address" name="customer_address">
                    </div>

                    <div class="col-12 d-flex justify-content-center ">
                        <button type="submit" class="btn btn-primary m-2">Add</button>
                        <a href="/customer" class="btn btn-danger m-2">Back</a>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<footer>
    <h3>Make By PennyWise</h3>
</footer>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>

</html>
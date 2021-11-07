<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Product</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/product">Back to product list</a>
</p>
<table>
    <tr>
        <td>Ten San Pham: </td>
        <td>${requestScope["product"].getTenSanPham()}</td>
    </tr>
    <tr>
        <td>Gia San Pham: </td>
        <td>${requestScope["product"].getGiaSanPham()}</td>
    </tr>
    <tr>
        <td>Mo Ta San Pham: </td>
        <td>${requestScope["product"].getMoTaSanPham()}</td>
    </tr>
    <tr>
        <td>Nha San Xuat: </td>
        <td>${requestScope["product"].getNhaSanXuat()}</td>
    </tr>
</table>
</body>
</html>
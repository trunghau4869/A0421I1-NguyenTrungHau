<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting Product</title>
</head>
<body>
<h1>Delete Product</h1>
<p>
    <a href="/product">Back to product list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Product information</legend>
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
            <tr>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/product">Back to product list</a></td>
            </tr>
        </table>
    </fieldset>
</body>
</html>
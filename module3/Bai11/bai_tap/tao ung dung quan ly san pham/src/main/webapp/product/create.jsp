<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new Product</title>
    <style>
        .message{
            color:green;
        }
    </style>
</head>
<body>
<h1>Create new Product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/product">Back to Product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Ten San Pham: </td>
                <td><input type="text" name="tenSanPham" id="tenSanPham"></td>
            </tr>
            <tr>
                <td>Gia San Pham: </td>
                <td><input type="text" name="giaSanPham" id="giaSanPham"></td>
            </tr>
            <tr>
                <td>Mo Ta San Pham: </td>
                <td><input type="text" name="moTaSanPham" id="moTaSanPham"></td>
            </tr>
            <tr>
                <td>Nha San Xuat: </td>
                <td><input type="text" name="nhaSanXuat" id="nhaSanXuat"></td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" value="Create product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
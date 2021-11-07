<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Product</h1>
<p>
    <a href="/product?action=create">Create new Product</a>
</p>
<%--//    id, tên sản phẩm, giá sản phẩm, mô tả của sản phẩm, nhà sản xuất.//--%>
<table border="1">
    <tr>
        <td>Ten San Pham</td>
        <td>Gia San Pham</td>
        <td>Mo Ta San Pham</td>
        <td>Nha San Xuat</td>
        <td>edit</td>
        <td>delete</td>
    </tr>
    <c:forEach items='${requestScope["product"]}' var="product">
        <tr>
            <td><a href="/product?action=view&id=${product.getId()}">${product.getTenSanPham()}</a></td>
            <td>${product.getGiaSanPham()}</td>
            <td>${product.getMoTaSanPham()}</td>
            <td>${product.getNhaSanXuat()}</td>
            <td><a href="/product?action=edit&id=${product.getId()}">edit</a></td>
            <td><a href="/product?action=delete&id=${product.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
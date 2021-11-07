<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>
<h1>Edit Product</h1>
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
                <td><input type="text" name="tenSanPham" id="tenSanPham" value="${requestScope["product"].getTenSanPham()}"></td>
            </tr>
            <tr>
                <td>Gia San Pham: </td>
                <td><input type="text" name="giaSanPham" id="giaSanPham" value="${requestScope["product"].getGiaSanPham()}"></td>
            </tr>
            <tr>
                <td>Mo Ta San Pham: </td>
                <td><input type="text" name="moTaSanPham" id="moTaSanPham" value="${requestScope["product"].getMoTaSanPham()}"></td>
            </tr>
            <tr>
                <td>Nha San Xuat: </td>
                <td><input type="text" name="nhaSanXuat" id="nhaSanXuat" value="${requestScope["product"].getNhaSanXuat()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
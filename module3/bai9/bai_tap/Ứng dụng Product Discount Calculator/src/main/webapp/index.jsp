<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 10/26/2021
  Time: 12:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Product Discount Calculator </h1>
<form action="/productDiscountCalculator" method="post">
    <label>Product Description: </label><br/>
    <input type="text" name="ProductDescription" placeholder="PRODUCTDESCRIPTION" value=""/><br/>
    <label>List Price: </label><br/>
    <input type="text" name="ListPrice" placeholder="LISTPRICE" value=""/><br/>
    <label>Discount Percent: </label><br/>
    <input type="text" name="DiscountPercent" placeholder="DISCOUNTPERCENT" value=""/><br/>
    <input type="submit" id="submit" value=" Calculate Discount"/>
</form>
</body>
</html>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 12/1/2021
  Time: 3:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
 <h1>Sandwich Codiments</h1>

 <form action="save" method="post">
   <input type="checkbox" name="Lettuce" value="Lettuce">Lettuce
   <input type="checkbox" name="Tomato" value="Tomato">Tomato
   <input type="checkbox" name="Mustard" value="Mustard">Mustard
   <input type="checkbox" name="Sprouts" value="Sprouts">Sprouts
     <br><button type="submit">Save</button>
 </form>
  </body>
</html>

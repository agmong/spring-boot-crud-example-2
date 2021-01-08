<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/13/2020
  Time: 10:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="lolzorStylesheet.css">
</head>
<body>
<table border="1" cellpadding="5" class="TFtable">
    <caption><h2>Table Items</h2></caption>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Quanity</th>
        <th>Price</th>
    </tr>

        <tr>
            <td>
                ${id}
            </td>
            <td>${name} </td>
            <td>${quanity} </td>
            <td>${price} </td>
        </tr>



</table>
<h3>Total Number of products: ${count}</h3>
</body>
</html>

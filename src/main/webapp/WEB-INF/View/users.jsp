<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/3/2020
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
<head>
    <title>JSTL sql:setDataSource Tags</title>
</head>
<body>
    
    <% response.setIntHeader("Refresh",30);%>

    <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/cunycst"
    user="root" password="test" />

    <sql:query var="resultSet" dataSource="${snapshot}" sql="SELECT * FROM product_tbl "/>
    <table border="1" cellpadding="5">
        <caption><h2>Table Items</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Quanity</th>
            <th>Price</th>
        </tr>
        <c:forEach var="item" items="${resultSet.rows}">
            <tr>
                <td>
                    <c:out value="${item.id}"/>
                </td>
                <td><c:out value="${item.name}"/> </td>
                <td><c:out value="${item.quanity}"/> </td>
                <td><c:out value="${item.price}"/> </td>
            </tr>
        </c:forEach>


    </table>
<div>
    <sql:query var="itemSet" dataSource="${snapshot}" sql="SELECT NAME FROM product_tbl"/>
    <form action="/lolzor" method="post">
        <label for="itemNames">Choose A Item</label>
        <select name="name" id="name">
            <c:forEach var="itemName" items="${resultSet.rows}">
                <option value="${itemName.name}" name="name">${itemName.name}</option>
            </c:forEach>
        </select>
        <input type="submit" value="Submit">
    </form>
</div>


</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/13/2020
  Time: 1:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
<head>
</head>
<body>
<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
                   url="jdbc:mysql://localhost:3306/cunycst"
                   user="root" password="test" />

<sql:query var="resultSet" dataSource="${snapshot}" >
    Select * from product_tbl where name = ?
    <sql:param value="${param.itemNames}"/>
</sql:query>
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


</body>
</html>

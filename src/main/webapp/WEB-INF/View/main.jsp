<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/2/2020
  Time: 3:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Using Get Method for form data</title>
</head>
<body>
<h1>Using GET Method to Read Form Data</h1>
<ul>
    <li><p><b>First Name:</b>
        <%= request.getParameter("first_name")%>
    </p></li>
    <li><p><b>Last  Name:</b>
        <%= request.getParameter("last_name")%>
    </p></li>
</ul>
</body>
</html>

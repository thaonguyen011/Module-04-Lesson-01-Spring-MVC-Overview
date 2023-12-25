
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 25/12/2023
  Time: 09:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List</title>
  <style>
    table {
      border: 1px solid #000;
    }

    th, td {
      border: 1px dotted #555;
    }
  </style>
</head>
<body>
<h1>Customer List</h1>
There are ${requestScope.customers.size()} customer(s) in list.
<table>
  <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Email</th>
    <th>Address</th>
  </tr>
  <c:forEach items="${requestScope.customers}" var="customer">
    <tr>
    <td>${customer.id}</td>
    <td><a href="info.jsp?id=${customer.id}">${customer.name}</a></td>
    <td>${customer.email}</td>
    <td>${customer.address}</td>
    </tr>
  </c:forEach>
</table>

</body>
</html>

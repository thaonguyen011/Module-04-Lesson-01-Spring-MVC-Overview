<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 26/12/2023
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer info</title>
</head>
<body>
<h1>
  Customer info
</h1>
<fieldset>
  <legend>Customer Details</legend>
  <p>Id: ${customer.id}</p>
  <p>Name: ${customer.name}</p>
  <p>Email: ${customer.email}</p>
  <p>Address: ${customer.address}</p>
</fieldset>

</body>
</html>

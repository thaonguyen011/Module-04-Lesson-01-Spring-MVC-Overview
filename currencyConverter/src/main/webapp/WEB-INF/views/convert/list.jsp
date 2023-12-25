<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 25/12/2023
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<h1>Currency Converter</h1>
<br>
<form action="/convert" method="post">
<table>
    <tr>
        <th>USD</th>
        <td>
            <label>
                <input type="text" name="usd" placeholder="1, 2, 3, 4">
            </label>
        </td>
    </tr>
    <tr>
        <th>Currency</th>
        <td>
            <label>
                <input type="text" name="currency" placeholder="20000">
            </label>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Convert">
        </td>
    </tr>
</table>
</form>
<p>Result: ${result}</p>

</body>
</html>

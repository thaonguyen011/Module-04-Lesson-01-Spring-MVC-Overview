<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<h1>Simple Dictionary
</h1>
<br/>
<form method="post">
    <table>
        <tr>
            <td>Word</td>
        <td>
            <label>
                <input type="text" name="word" placeholder="Enter a word">
            </label>
        </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit">
            </td>
        </tr>
    </table>
</form>
<p>Result: ${result}</p>
</body>
</html>
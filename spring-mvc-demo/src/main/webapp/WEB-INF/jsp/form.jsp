<%--
  Created by IntelliJ IDEA.
  User: manisha
  Date: 13/10/18
  Time: 11:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LOGIN</title>
</head>
<body>
${heading}
<br>
<%--<form action="/submit" method="post">--%>
<form action="/submitform" method="post">
    <label>FirstName</label>
    <%--<input name="firstName" type="text">--%>
    <input name=${studentCo.firstName}>


    <label>LastName</label>
    <%-- <input name="lastName" type="text">--%>
    <input name=${studentCo.lastName}>
    <input type="submit">
</form>
</body>
</html>

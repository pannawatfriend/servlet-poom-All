<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body style ="background-color: ${cookie["color"].value}">
<h1><%= "Hello Jid!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<form action="color-servlet" method="post">
    <input type="radio" name="color" value="red">
    <input type="radio" name="color" value="blue">
    <input type="submit">
</form>

</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: tinnapop
  Date: 10/29/2023
  Time: 11:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>student</title>
</head>
<body style ="background-color: ${cookie["color"].value}">
<p>id : ${cookie["jid_id"].value}</p>
<p>name : ${cookie["jid_name"].value}</p>
<a href="index.jsp">back</a>
</body>
</html>

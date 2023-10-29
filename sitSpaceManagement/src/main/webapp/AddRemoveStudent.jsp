<%--
  Created by IntelliJ IDEA.
  User: butte
  Date: 28/10/2023
  Time: 23:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADD/REMOVE Student</title>
</head>
<style>
    div{
        margin-top: 10px;
    }
</style>
<body>

    <h1>SitSpaceManagement</h1>
    Page: <a href="AddRemoveStudent.jsp">ADD/REMOVE Student</a> | <a href="AllData.jsp">Show All Data</a>

    <h3>Add Student Data</h3>
    <form action="AddServlet" method="post">
        ID: <input type="text" name="id" required> Name : <input type="text" name="name" required><br>
        Score: <input type="text" name="score" required><br>
        <input type="submit" value="ADD">
    </form>
    <hr>
    <h3>Remove Student Data</h3>
    <form action="RemoveServlet" method="post">
        ID: <input type="text" name="id" required><br>
        <input type="submit" value="REMOVE">
    </form>
    <hr>
    ${message}
</body>
</html>

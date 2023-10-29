<%--
  Created by IntelliJ IDEA.
  User: butte
  Date: 28/10/2023
  Time: 23:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>AllData</title>
</head>
<body>
    <h1>SitSpaceManagement</h1>
    Page: <a href="AddRemoveStudent.jsp">ADD/REMOVE Student</a> | <a href="AllData.jsp">Show All Data</a>

    <h3>All Data</h3>
    <table>
        <tr>
            <th>#</th>
            <th>ID</th>
            <th>Name</th>
            <th>Score</th>
            <th>Grade</th>
        </tr>
    <c:forEach items="${sessionScope.allStudent.allData}" var="student" varStatus="vs">
        <tr>
            <td>${vs.count}</td>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.score}</td>
            <td>${student.getCalculateGrade()}</td>
        </tr>
    </c:forEach>
    </table>

</body>
</html>

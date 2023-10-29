<%--
  Created by IntelliJ IDEA.
  User: butte
  Date: 22/9/2566
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Multiplication Table</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-image: linear-gradient(to bottom, #f0f0f0, #dcdcdc);
            text-align: center;
            margin: 0;
            padding: 0;
        }

        h3 {
            color: #333;
        }

        table {
            border-collapse: collapse;
            margin: 0 auto;
            background-color: white;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
        }

        table, th, td {
            border: 1px solid #555;
        }

        th, td {
            padding: 10px;
            text-align: center;
        }

        th {
            background-color: #333;
            color: white;
        }

        .number {
            text-align: center;
        }
    </style>
</head>
<body>
<h3 style="padding-top: 15px">Multiplication Table</h3>
<hr>
<c:if test="${error == null }">
    <table style="width: 50%">
        <tr>
            <th colspan="5" style="text-align: center; background-color: cornflowerblue; color: ghostwhite;">MT
                for ${param.number}</th>
        </tr>
        <c:forEach begin="1" end="12" var="n">
            <c:choose>
                <c:when test="${n%3==1}">
                    <c:set var="bg" scope="page" value="white"/>
                </c:when>
                <c:when test="${n%3==2}">
                    <c:set var="bg" scope="page" value="lightgray"/>
                </c:when>
                <c:otherwise>
                    <c:set var="bg" scope="page" value="=gray"/>
                </c:otherwise>
            </c:choose>
            <tr style="background-color: ${bg}">
                <td class="number">${param.number}</td>
                <td>x</td>
                <td>${n}</td>
                <td>=</td>
                <td>${n * param.number}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<c:if test="${error != null}">
    <h3 style="color:red">
        Error: ${requestScope.error} (${param.number != null || param.number =='' ? param.number : "Null/Empty"})
    </h3>
</c:if>
<hr>
Your browser: ${header['User-Agent']}
</body>
</html>

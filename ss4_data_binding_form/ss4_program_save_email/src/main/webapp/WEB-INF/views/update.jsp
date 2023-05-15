<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/5/2023
  Time: 6:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Program update electric email</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h2 style="text-align: center">Setting</h2>
<div class="container">
    <form:form action="/program" method="post" modelAttribute="program">
        <table class="table">
            <thead>
            <tr>
                <td>
                    <form:label path="languages">Languages</form:label>
                    <form:select path="languages">
                        <form:options items="${languages}"/>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="pageSize">Page Size : </form:label>
                    Show <form:select path="pageSize">
                    <form:options items="${pageSize}"/>
                </form:select> emails per page
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="spamsFilter">Spams Filter : </form:label>
                    <form:checkbox path="spamsFilter" value="Enable spams filter"/> Enable spams filter
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="signature">Signature : </form:label>
                    <form:textarea type="text" path="signature"/>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Update" class="btn btn-primary">
                    <input type="button" value="Cancel" class="btn btn-danger" onclick="window.location='/program'">
                </td>
            </tr>
            </thead>
        </table>
    </form:form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>

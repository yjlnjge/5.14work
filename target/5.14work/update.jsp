<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="update" method="post">
    <input type="hidden" name="id" value="${u3.id}">
    <table>

        <tr>
            <td>用户名:</td>
            <td><input type="text" name="stuName" value="${u3.stuName}"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td>
                <input type="text" name="stuAge" value="${u3.stuAge}">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="修改">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
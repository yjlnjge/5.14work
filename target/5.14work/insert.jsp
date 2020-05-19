<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="add" method="post">
    <table>
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="stuName"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td>
                <input type="text" name="stuAge">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="新增">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
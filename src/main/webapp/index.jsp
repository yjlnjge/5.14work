<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
    <a href="insert.jsp">新增</a>
    <form method="post" action="selectById">
        <input type="text" name="stuName">
        <input type="submit" value="查询">

    </form>
    <table>
        <tr>
            <th>用户名</th>
            <th>性别</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.stuName}</td>
                <td>${user.stuAge}</td>
                <td><a href="./updateData?id=${user.id}">修改</a></td>
            </tr>
        </c:forEach>

    </table>
</body>
</html>

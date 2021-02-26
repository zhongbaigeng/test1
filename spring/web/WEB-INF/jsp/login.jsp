<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>系统登录</title>
    <style type="text/css">
        div {
            width: 250px;
            margin: 30px auto;
            padding: 30px;
            border: 2px solid powderblue;
            background-color: lightyellow;
        }
        input {
            margin: 10px;
        }
    </style>
</head>
<body>
<div>
    <h3>用户登录</h3>
    <form action="${pageContext.request.contextPath}/index/login" method="post">
        <c:if test="${not empty errorMsg}"><span style="color: red">${errorMsg}</span></c:if>
        <table>
            <tr>
                <td>账号：</td>
                <td>
                    <input type="text" name="username" required="required"/>
                </td>
            </tr>
            <tr>
                <td>密码：</td>
                <td>
                    <input type="password" name="password" required="required"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="登录" /><input type="reset" value="重置" />
                </td>
            </tr>
        </table>


    </form>
</div>

</body>
</html>
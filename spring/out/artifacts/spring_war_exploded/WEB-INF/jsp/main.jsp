<%@ page language="java" import="java.util.List" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>学生信息</title>
    <style type="text/css">
        #outer {
            width: 50%;
            margin: 30px auto;
            padding: 10px;
            border: 2px solid powderblue;
            background-color: lightyellow;
        }
        #top {
            width: 90%;
            height:20px;
            margin: 10px auto;
            padding: 5px;
        }
        span {
            float: right;
        }
        #content {
            width: 90%;
            margin: 10px auto;
            padding: 10px;
        }
        table {
            border: 2px solid powderblue;
            width: 100%;
        }
        table thead tr{
            background-color: grey;
        }
        table tbody tr:nth-child(odd){
            background-color: wheat;
        }
        table tbody tr:nth-child(even){
            background-color: skyblue;
        }
        table tbody tr:hover{
            background-color: wheat;
        }
    </style>
</head>
<body>
<div id="outer">

    <div id="content">
        <table>
            <caption><h3>学生成绩表</h3></caption>
            <thead>
            <tr>
                <th>学号</th>
                <th>姓名</th>
                <th>语文</th>
                <th>数学</th>
                <th>英语</th>
                <th>物理</th>
                <th>化学</th>
                <th>地理</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${logList}" var="l">
                <tr>
                    <td>${l.id}</td>
                    <td>${l.name}</td>
                    <td>${l.chinese}</td>
                    <td>${l.math}</td>
                    <td>${l.english}</td>
                    <td>${l.physics}</td>
                    <td>${l.chemistry}</td>
                    <td>${l.geography}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>

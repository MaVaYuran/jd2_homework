<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="jakarta.tags.core"%>
<html>
    <head>
        <title>Hello</title>
    </head>

    <body>
        <h2>Hello ${sessionScope.user.name}!</h2>
    </body>
</html>
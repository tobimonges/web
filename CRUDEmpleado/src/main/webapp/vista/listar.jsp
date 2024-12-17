
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
    <body>
        <table>
            <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Fecha Ingreso</th>
                <th>Sueldo</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${empleado}" var="item">
                <tr>
                    <td>${item.id_empleado}</td>
                    <td>${item.nombre}</td>
                    <td>${item.apellido}</td>
                    <td>${item.fecha_ingreso}</td>
                    <td>${item.sueldo}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </body>
</html>

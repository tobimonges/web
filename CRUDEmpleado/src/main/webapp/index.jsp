<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Inicio</title>
</head>
    <body>
        <%
            response.sendRedirect("empleado-controlador?accion=listar");
        %>

    </body>
</html>
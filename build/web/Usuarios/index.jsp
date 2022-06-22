 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>USUARIOS</title>
    </head>
    <body>
        <h1>Usuarios</h1>
        
        <a href="UsuariosController?accion=nuevo">Nuevo Registro</a>
        
        <br /><br />
        
        <table border="1" width="80%">
            <thead>
                <tr>
                    <th>Usuario ID</th>
                    <th>Rol Usuario</th>
                    <th>Persona ID</th>
                    <th>Nombre Ususario</th>
                    <th>Fecha Expiración</th>
                    <th>Password</th>
                    <th></th>
                    <th></th>

                    
                </tr>
            </thead>
            <tbody>
                <c:forEach var="usuario" items="${lista}">
                    
                    <tr>
                        <td><c:out value="${usuario.usu_id}" /></td>
                        <td><c:out value="${usuario.rol_id}" /></td>
                        <td><c:out value="${usuario.per_id}" /></td>
                        <td><c:out value="${usuario.usu_name}" /></td>
                        <td><c:out value="${usuario.fecha_expira}" /></td>
                        <td><c:out value="${usuario.password}" /></td>
                        <td><a href="usuariosController?accion=modificar&pro_id<c:out value="${usuario.usu_id}" />">Modificar</a></td>
                        <td><a href="usuariosController?accion=eliminar&pro_id<c:out value="${usuario.usu_id}" />">Eliminar</a></td>
                    </tr>
                    
                    
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>

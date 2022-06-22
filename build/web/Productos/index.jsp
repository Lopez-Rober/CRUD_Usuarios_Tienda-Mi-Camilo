 

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
        
        <a href="ProductosController?accion=nuevo">Nuevo Registro</a>
        
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
                <c:forEach var="producto" items="${lista}">
                    
                    <tr>
                        <td><c:out value="${producto.cat_id}" /></td>
                        <td><c:out value="${producto.marca_id}" /></td>
                        <td><c:out value="${producto.prod_stock}" /></td>
                        <td><c:out value="${producto.prov_id}" /></td>
                        <td><c:out value="${producto.prod_nombre}" /></td>
                        <td><c:out value="${producto.prod_precio}" /></td>
                        <td><a href="ProductosController?accion=modificar&pro_id<c:out value="${producto.prod_id}" />">Modificar</a></td>
                        <td><a href="ProductosController?accion=eliminar&pro_id<c:out value="${producto.prod_id}" />">Eliminar</a></td>
                    </tr>
                    
                    
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>

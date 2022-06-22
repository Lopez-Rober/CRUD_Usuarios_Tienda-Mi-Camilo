 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios</title>
    </head>
    <body>
        <h2>Nuevo Registro</h2>

        
        <form action="UsuariosController?accion=insertar" method="POST" autocomplete="off">
            
<input prod_id="usu_id" name="id" type="hidden" />
            
            <p>
                ROL
                <input usu_id ="rol_id" name="rol_id" type="text" />
            </p>
            <p>
                PERSONA ID
                <input per_id="per_id" name="per_id" type="text" />
            </p>
            <p>
                NOMBRE DE USUARIO
                <input prod_nombre="usu_name" name="usu_name" type="text" />
            </p>
            <p>
                FECHA EXPIRA
                <input marca_id="fecha_expira" name="fecha_expira" type="text" />
            </p>
            <p>
                CONTRASEÑA  
                <input prod_stock="password" name="password" type="text" />
            </p>
            
            <button id="guardar" name="guardar" type="submit">Guardar</button>
            
        </form>
        
        
    </body>
</html>

<%-- 
    Document   : modificar
    Created on : 17/06/2022, 12:22:36 AM
    Author     : MiguelMaquen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Productos</title>
    </head>
    <body>
        <h2>Modificar Registro</h2>

        
        <form action="" method="POST" autocomplete="off">
            
            
                <input prod_id="prod_id" name="id" type="hidden" />
            
            <p>
                Precio
                <input prod_precio="prod_precio" name="prod_precio" type="text" />
            </p>
            <p>
                Categoria
                <input cat_id="cat_id" name="cat_id" type="text" />
            </p>
            <p>
                Nombre
                <input prod_nombre="prod_nombre" name="prod_nombre" type="text" />
            </p>
            <p>
                Marca
                <input marca_id="marca_id" name="marca_id" type="text" />
            </p>
            <p>
                Stock
                <input prod_stock="prod_stock" name="prod_stock" type="text" />
            </p>
            <p>
                Proveedor
                <input prov_id="prov_id" name="prov_id" type="text" />
            </p>
            
            <button id="guardar" name="guardar" type="submit">Guardar</button>
            
        </form>
    </body>
</html>

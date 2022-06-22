package controlador;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuarios;
import modelo.UsuariosDAO;


@WebServlet(name = "ProductosController", urlPatterns = {"/ProductosController"})
public class UsuariosController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        String accion;
        RequestDispatcher dispatcher = null; //enviar las peticiones de la url
        
        accion = request.getParameter("accion"); // lo utilizamos para recoger parametros por peticion get
        
        if(accion == null || accion.isEmpty()){
        dispatcher = request.getRequestDispatcher("Usuarios/index.jsp");
        List<Usuarios> ListarUsuarios = usuariosDAO.listarUsuarios();
        request.setAttribute("lista", ListarUsuarios); 
        } else if ("nuevo".equals(accion)){
            dispatcher = request.getRequestDispatcher("Usuarios/nuevo.jsp");
        }else if ("insertar".equals(accion)){
            
            int rol_id = Integer.parseInt(request.getParameter("rol_id"));
            int per_id = Integer.parseInt(request.getParameter("per_id"));
            int fecha_expira = Integer.parseInt(request.getParameter("fecha_expira"));
            int password = Integer.parseInt(request.getParameter("password"));
            String usu_name = request.getParameter("usu_name");
            Double passwd = Double.parseDouble(request.getParameter("passwd"));
            
            Usuarios producto = new Usuarios(0, rol_id, per_id, fecha_expira, password, usu_name, passwd);
            
            usuariosDAO.insertarProducto(producto);          
            dispatcher = request.getRequestDispatcher("Productos/index.jsp");
            List<Usuarios> listarProductos = usuariosDAO.listarUsuarios();
            request.setAttribute("lista", listarProductos);
            
        } else if ("modificar".equals(accion)){
            dispatcher = request.getRequestDispatcher("Productos/modificar.jsp");
            int usu_id = Integer.parseInt(request.getParameter("usu_id"));
            Usuarios producto = usuariosDAO.mostrarProducto(usu_id);
            request.setAttribute("producto", producto);
            
        } else if ("actualizar".equals(accion)){
            
            int usu_id = Integer.parseInt(request.getParameter("usu_id"));
            int rol_id = Integer.parseInt(request.getParameter("rol_id"));
            int per_id = Integer.parseInt(request.getParameter("per_id"));
            int fecha_expira = Integer.parseInt(request.getParameter("fecha_expira"));
            int password = Integer.parseInt(request.getParameter("password"));
            String usu_name = request.getParameter("usu_name");
            Double passwd = Double.parseDouble(request.getParameter("passwd"));
            
            Usuarios usuarios = new Usuarios(usu_id, rol_id, per_id, fecha_expira, password, usu_name, passwd);
            
            usuariosDAO.actualizarUsuario(usuarios);          
            dispatcher = request.getRequestDispatcher("Usuarios/index.jsp");
            List<Usuarios> listarUsuario = usuariosDAO.listarUsuarios();
            request.setAttribute("lista", listarUsuario);
        }
        
        dispatcher.forward(request, response);
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </efold>ditor-fold>

}

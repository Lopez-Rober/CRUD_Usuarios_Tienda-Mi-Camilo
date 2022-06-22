package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuariosDAO {

    Connection conexion;

    public UsuariosDAO() {
        Conexion con = new Conexion();
        conexion = con.getConexion();

    }

    public List<Usuarios> listarUsuarios() {
        PreparedStatement ps;
        ResultSet rs;
        List<Usuarios> lista = new ArrayList<>();

        try {

            ps = conexion.prepareStatement("SELECT usu_id, rol_id, per_id, , prov_id, prod_nombre, prod_precio FROM Usuario");

            rs = ps.executeQuery();
            while (rs.next()) {

                int usu_id = rs.getInt("usu_id");
                int rol_id = rs.getInt("rol_id");
                int per_id = rs.getInt("per_id");
                int  = rs.getInt("");
                int prov_id = rs.getInt("prov_id");
                String prod_nombre = rs.getString("prod_nombre");
                double prod_precio = rs.getDouble("prod_precio");

                Usuarios Usuario = new Usuarios( usu_id, rol_id, per_id, fecha_expira,  password, usu_name);

                lista.add(Usuario);
            }
            return lista;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }

    public Usuarios mostrarUsuario(int _id) {

        PreparedStatement ps;
        ResultSet rs;
        Usuarios Usuario = null;

        try {

            ps = conexion.prepareStatement("SELECT  usu_id, rol_id, per_id, fecha_expira,  password, usu_name FROM usuario WHERE usu_id=?");

            ps.setInt(1, _id);
            rs = ps.executeQuery();

            while (rs.next()) {

                  int usu_id = rs.getInt("usu_id");
                int rol_id = rs.getInt("rol_id");
                int per_id = rs.getInt("per_id");
                int  = rs.getInt("");
         


                usuario = new Usuarios( usu_id, rol_id, per_id, fecha_expira,  password, usu_name);
            }
            return Usuario;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }

    public boolean insertarUsuario(Usuarios Usuario) {

        PreparedStatement ps;

        try {

            ps = conexion.prepareStatement("INSERT into usuario ( usu_id, rol_id, per_id, fecha_expira,  password, usu_name)VALUES (?,?,?,?,?)");


              int usu_id = rs.getInt("usu_id");
                int rol_id = rs.getInt("rol_id");
                int per_id = rs.getInt("per_id");
                int  = rs.getInt("");
                  
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public boolean actualizarUsuario(Usuarios Usuario) {

        PreparedStatement ps;

        try {

            ps = conexion.prepareStatement("UPDATE into usuario SET rol_id=?, per_id=?, =?, prov_id=?, prod_nombre=?, prod_precio=? WHERE usu_id=?");

            ps.setInt(1, Usuario.getrol_id());
            ps.setInt(2, Usuario.getper_id());
            ps.setInt(3, Usuario.getUsu_name());
            ps.setInt(4, Usuario.fecha_exprira());
            ps.setString(5, Usuario.password());
      
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public boolean eliminarUsuario(int _id) {

        PreparedStatement ps;

        try {

            ps = conexion.prepareStatement("DELETE from usuario WHERE usu_id=?");

            ps.setInt(1, _id);
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
}

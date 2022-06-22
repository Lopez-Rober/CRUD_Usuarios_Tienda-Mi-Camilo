 
package modelo;

import java.sql.Date;

 
public class Usuarios {
    
    private int usu_id, rol_id, per_id;
    private String fecha_expira, password, usu_name;
    private double passwd;

    public Usuarios(int usu_id, int rol_id, int per_id, String fecha_expira, String password, String usu_name, double passwd) {
        this.usu_id = usu_id;
        this.rol_id = rol_id;
        this.per_id = per_id;
        this.fecha_expira = fecha_expira;
        this.password = password;
        this.usu_name = usu_name;
        this.passwd = passwd;
    }

    public int getUsu_id() {
        return usu_id;
    }

    public void setUsu_id(int usu_id) {
        this.usu_id = usu_id;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public int getPer_id() {
        return per_id;
    }

    public void setPer_id(int per_id) {
        this.per_id = per_id;
    }

    public String getFecha_expira() {
        return fecha_expira;
    }

    public void setFecha_expira(String fecha_expira) {
        this.fecha_expira = fecha_expira;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsu_name() {
        return usu_name;
    }

    public void setUsu_name(String usu_name) {
        this.usu_name = usu_name;
    }

    public double getPasswd() {
        return passwd;
    }

    public void setPasswd(double passwd) {
        this.passwd = passwd;
    }

    
    
}

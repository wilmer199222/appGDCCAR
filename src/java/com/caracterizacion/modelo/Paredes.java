
package com.caracterizacion.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Estudiante
 */
public class Paredes {
   private int idParedes;
   private String nombre;
   private String estado;

    public Paredes() {
    }

    public Paredes(int idParedes, String nombre, String estado) {
        this.idParedes = idParedes;
        this.nombre = nombre;
        this.estado = estado;
    }
    
    public static Paredes load(ResultSet rs)throws SQLException{
        Paredes objParedes = new Paredes();
        objParedes.setIdParedes(rs.getInt(1));
        objParedes.setNombre(rs.getString(2));
        objParedes.setEstado(rs.getString(3));
        
        
        return objParedes;
    }

    public int getIdParedes() {
        return idParedes;
    }

    public void setIdParedes(int idParedes) {
        this.idParedes = idParedes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Paredes{" + "idParedes=" + idParedes + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
   
   
}

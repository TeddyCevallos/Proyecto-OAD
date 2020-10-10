/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Turismo_NL;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author teddy
 */
public class Lugar {

    public String nombre, direccion, descripcion;

    public int i=0;
    public Lugar() {
    }

    public Lugar(String nombre, String direccion, String descripcion) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
}

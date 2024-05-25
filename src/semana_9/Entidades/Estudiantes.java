/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_9.Entidades;

/**
 *
 * @author Estudiante
 */
public class Estudiantes {
    
    String nombre;
    String apellido;
    String dni;
    
    public String getTexto(){
        return "Nombre: " + nombre + "  Apellido: " + apellido + "  DNI: " +dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return dni;
    }

    public void setDNI(String dni) {
        this.dni = dni;
    }

    
    
}

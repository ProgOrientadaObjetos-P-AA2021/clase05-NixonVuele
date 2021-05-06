/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqutedos;

/**
 *
 * @author nixon
 */
public class Usuario {

    private String nombre;
    private String apellido;
    private String identificacion;

    public void establecerNombre(String f) {
        nombre = f;
    }

    public void establecerApellido(String f) {
        apellido = f;
    }

    public void establecerIdentificacion(String f) {
        identificacion = f;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }
}

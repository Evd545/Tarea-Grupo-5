/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasepersona;

/**
 *
 * @author elvin
 */
public class ClasePersona {

    public static void main(String[] args) {

    }
    
    // Persona.java

public class Persona {
    private String nombre;
    private int edad;
    private String genero;

    // Construccion
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    //  (encapsulamiento)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // obtener información
    public String obtenerInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Género: " + genero;
    }
}

}


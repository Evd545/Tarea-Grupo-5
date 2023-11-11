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

tipo_usuario = "Free"
publicidad = True

def __init__(self, nid, alias, nombre, apellidos):
	self.nid = nid
	self.alias = alias
	self.nombre = nombre
	self.apellidos = apellidos

def muestra_datos(self):
	print("El nombre y los apellidos del usuario son: " + self.nombre, self.apellidos)
	print("El ID de usuario es: " + self.nid + ".")
	print("El alias del usuario es: " + self.alias + ".")


class UsuariosPremium:

tipo_usuario = "Premium"
publicidad = False

def __init__(self, nid, alias, nombre, apellidos):
	self.nid = nid
	self.alias = alias
	self.nombre = nombre
	self.apellidos = apellidos

def muestra_datos(self):
	print("El nombre y los apellidos del usuario son: " + self.nombre, self.apellidos)
	print("El ID de usuario es: " + self.nid + ".")
	print("El alias del usuario es: " + self.alias + ".")

usuario1 = Usuarios("001", "Dsoto", "Daniel", "Soto Palacios")

usuario1.muestra_datos()

print(usuario1.tipo_usuario)
    }
}

	public class Deportista {
 class Deportista(Persona):
  def __init__(self, nombre, edad, genero, deporte):
    super().__init__(nombre, edad, genero)
    self.deporte = deporte
  
  # Método entrenar de la subclase Deportista
  def entrenar(self, tiempo):
    print(self.nombre + " ha entrenado " + str(tiempo) + " minutos en " + self.deporte + ".")
    
}



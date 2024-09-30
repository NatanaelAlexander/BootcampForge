package clases;

public class Persona {

    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public static void verificar() {
        System.out.print("Funco xd");
    }

    /* Getters*/
    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    /* Setters */
    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /* Desplegar información */
    public void despliegaInformacion() {
        System.out.println("nombre: " + nombre + " Edad: " + edad);
    }
}

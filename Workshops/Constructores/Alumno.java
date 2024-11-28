package Constructores;

public class Alumno {

    private String nombre;
    private int edad;
    private String materia;

    public Alumno() {
        this.nombre = "Carlos";
        this.edad = 18;
        this.materia = "Historia";
    }

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Alumno(String nombre, int edad, String materia) {
        this(nombre, edad);
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Alumno: " +
               "Nombre: " + this.nombre + ", " +
               "Edad: " + this.edad + ", " +
               "Materia: " + this.materia;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerEdad() {
        return edad;
    }

    public String obtenerMateria() {
        return materia;
    }
}

package Constructores;

public class Libro {

    private String nombre;
    private String autor;
    private int cantidadPaginas;

    public Libro() {
        this.nombre = "Libro Genérico";
    }

    public Libro(String nombre, String autor, int cantidadPaginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.cantidadPaginas = cantidadPaginas;
    }

    @Override
    public String toString() {
        return "Libro: " +
            "Nombre: " + this.nombre + ", " +
        "Autor: " + this.autor + ", " +
            "Páginas: " + this.cantidadPaginas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }
}

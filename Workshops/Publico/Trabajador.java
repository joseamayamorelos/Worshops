package Publico;

public class Trabajador {
    public String nombre;
    public int salario;

    public Trabajador() {
    }

    public Trabajador(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public int obtenerSalario() {
        return salario;
    }

    public void establecerSalario(int salario) {
        if (salario == 0) {
            System.out.println("El valor no puede ser modificado");
        } else {
            this.salario = salario;
        }
    }
}

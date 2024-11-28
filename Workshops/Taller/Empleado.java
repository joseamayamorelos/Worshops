package Taller;

public abstract class Empleado{
    public abstract double calcularSueldo();

    public void mostrarSueldo() {
        System.out.println("El salario es: " + calcularSueldo());
    }
}

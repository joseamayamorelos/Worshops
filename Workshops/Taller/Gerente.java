package Taller;

public class Gerente extends Empleado {
    private static final double sueldo = 10000;

    @Override
    public double calcularSueldo() {
        return sueldo;
    }
}


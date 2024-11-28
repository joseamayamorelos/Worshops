package Taller;

public class Vendedor extends Empleado {
    private double comision;
    private final double salarioBase = 15000;

    public Vendedor(double comision) {
        this.comision = comision;
    }

    @Override
    public double calcularSueldo() {
        if (comision == 0) {
            System.out.println("El vendedor no tiene comisión.");
        }

        return comision * salarioBase;
    }
}

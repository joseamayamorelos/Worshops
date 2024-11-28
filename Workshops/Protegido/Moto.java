package Protegido;

public class Moto extends Vehiculo {
    private int capacidadCilindrada;

    public Moto(String marca, String tipo, int capacidadCilindrada) {
        super(marca, tipo);
        this.capacidadCilindrada = capacidadCilindrada;
    }

    public int obtenerCapacidadCilindrada() {
        return capacidadCilindrada;
    }

    public void establecerCapacidadCilindrada(int capacidadCilindrada) {
        this.capacidadCilindrada = capacidadCilindrada;
    }
}

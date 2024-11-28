package Modificar;

public class Vehiculo {
    private String marca;
    private String modelo;
    public static int totalVehiculos = 0;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        totalVehiculos++;
    }

    public static void mostrarTotalVehiculos() {
        System.out.println("Total de vehículos: " + totalVehiculos);
    }

    public String obtenerMarca() {
        return marca;
    }

    public void asignarMarca(String marca) {
        this.marca = marca;
    }

    public String obtenerModelo() {
        return modelo;
    }

    public void asignarModelo(String modelo) {
        this.modelo = modelo;
    }

    public static int obtenerTotalVehiculos() {
        return totalVehiculos;
    }

    public static void establecerTotalVehiculos(int totalVehiculos) {
        Vehiculo.totalVehiculos = totalVehiculos;
    }
}

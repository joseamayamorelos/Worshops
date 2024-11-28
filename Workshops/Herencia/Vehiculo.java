package Herencia;

public class Vehiculo {
    protected String brand;
    protected int maxSpeed;
    
    public Vehiculo() {
    }

    public Vehiculo(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    
    public void showVehicle() {
        System.out.println("brand: " + brand + "," + "max Speed: " + maxSpeed);
    }
}

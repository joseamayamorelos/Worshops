package Acceso;

public class Carro {
    private String brand;
    private String model;
    private int maxSpeed;

    // Límite máximo para maxSpeed
    private static final int MAX_LIMIT = 300;

    public Carro() {
    }

    public Carro(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed >= 0 && maxSpeed <= MAX_LIMIT) {
            this.maxSpeed = maxSpeed;
        } else {
            System.out.println("La velocidad debe estar entre 0 y " + MAX_LIMIT + " km/h.");
        }
    }

    public void accelerate(int acc) {
        if (acc < 0) {
            System.out.println("La aceleración debe ser positiva.");
        } else if (maxSpeed + acc > MAX_LIMIT) {
            System.out.println("No se puede superar el límite máximo de velocidad de " + MAX_LIMIT + " km/h.");
            maxSpeed = MAX_LIMIT;
        } else {
            maxSpeed += acc;
            System.out.println("El carro aceleró a " + maxSpeed + " km/h.");
        }
    }

    public void brake(int dec) {
        if (dec < 0) {
            System.out.println("La desaceleración debe ser positiva.");
        } else if (maxSpeed - dec < 0) {
            maxSpeed = 0;
            System.out.println("El carro se detuvo por completo.");
        } else {
            maxSpeed -= dec;
            System.out.println("El carro redujo su velocidad a " + maxSpeed + " km/h.");
        }
    }
}

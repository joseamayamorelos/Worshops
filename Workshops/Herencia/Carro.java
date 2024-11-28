package Herencia;

public class Carro  extends Vehiculo{
    private int numberDor;

    public Carro(String brand, int maxSpeed, int numberDor) {
        super(brand, maxSpeed);
        this.numberDor = numberDor;
    }

    public int getNumberDor() {
        return numberDor;
    }

    public void setNumberDor(int numberDor) {
        this.numberDor = numberDor;
    }

    @Override
    public void showVehicle() {
        super.showVehicle();
        System.out.println("number of dor: " + numberDor);
    }
}

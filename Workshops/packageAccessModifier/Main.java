package packageAccessModifier;

// import packageAccessModifier.vehicles.MotorCycle;
// import packageAccessModifier.vehicles.Vehicle;

public class Main {

    public static void main(String[] args) {
        var product = new Producto("arrroz", 5000, 10);
        // var vehicle = new Vehicle();
        // MotorCycle motorCycle = new MotorCycle();

        // vehicle.type = "car";
        // motorCycle.type = "bike";

        product.showInfo();
    }
}

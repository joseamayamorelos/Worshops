package packageAccessModifier;

public class Producto {
    String name;
    double price;
    int stock;

    public Producto() {
    }

    public Producto(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

   
    void showInfo() {
        System.out.println("Name: " + name + " Price: " + " Stock: " + stock);
    }

    
}

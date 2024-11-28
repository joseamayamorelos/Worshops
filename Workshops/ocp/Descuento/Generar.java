package ocp.Descuento;

public class Generar {
    
    public double generateDiscount(Descuento typDiscount, double discount) {
        return typDiscount.processDiscount(discount);
    }
}

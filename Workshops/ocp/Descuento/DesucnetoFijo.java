package ocp.Descuento;

public class DesucnetoFijo extends Descuento {

    @Override
    public double processDiscount(double dicount) {
        return dicount * 0.05;   
    }
    
}

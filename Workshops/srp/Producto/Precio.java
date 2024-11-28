package srp.Producto;

import java.util.List;

public class Precio {

    public double calculatePrice(List<Producto> products) {
        var result = 0.0;
        for (Producto product : products) {
            result += product.getPrice();
        }

        return result;
    }
}

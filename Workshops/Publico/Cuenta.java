package Publico;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public Cuenta() {
    }

    public Cuenta(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public void mostrarInformacion(){
        System.out.println("Número de Cuenta: " + numeroCuenta + ", " + "Saldo: " + saldo + ", " + "Tipo de Cuenta: " + tipoCuenta);
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public void establecerSaldo(double saldo) {
        this.saldo = saldo;
    }
}


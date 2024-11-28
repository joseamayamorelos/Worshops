package Constructores;

public class Cuenta {

    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    public Cuenta() {
    }

    public Cuenta(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public Cuenta(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta Bancaria: Número de Cuenta: " + this.numeroCuenta + 
            ", Saldo: " + this.saldo + 
            ", Tipo de Cuenta: " + this.tipoCuenta;
    }

    public String obtenerNumeroCuenta() {
        return numeroCuenta;
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public String obtenerTipoCuenta() {
        return tipoCuenta;
    }
}


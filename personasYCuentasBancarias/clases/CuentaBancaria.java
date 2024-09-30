package clases;

import java.util.ArrayList;

public class CuentaBancaria {

    double saldo;
    String titular;
    int numeroCuenta;

    public static ArrayList<CuentaBancaria> CuentasBancarias = new ArrayList<CuentaBancaria>();

    public CuentaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = numeroRandom();
        CuentasBancarias.add(this);
    }

    public static void imprimeInformacionDeTodasLasCuentas() {
        for (int i = 0; i < CuentasBancarias.size(); i++) {
            CuentasBancarias.get(i).despliegaInformacion();
        }
    }

    /*  public static void despliegaInformacion(){
        
    } */
    public static int numeroRandom() {
        String a = "0";
        for (int i = 0; i < 6; i++) {
            int digito = (int) (Math.random() * 10);
            if (i == 0) {
                a = String.valueOf(digito);
            } else {
                a += String.valueOf(digito);
            }
        }
        int b = (int) Integer.parseInt(a);
        return b;
    }

    public void despliegaInformacion() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("numero de Cuenta: " + this.numeroCuenta);
        System.out.println("-------------------------------------------------------");
    }

    /* Getters */
    public void getSaldo() {
        System.out.println(this.saldo);
    }

    public void getTitular() {
        System.out.println(this.titular);
    }

    public void getNumeroCuenta() {
        System.out.println(this.numeroCuenta);
    }

    /* Setters */
    public void setSaldo(double nuevoSaldo) {
        this.saldo = nuevoSaldo;
    }

    public void setTitular(String nuevoTitular) {
        this.titular = nuevoTitular;
    }

    public void setNumeroCuenta(int nuevoNumeroCuenta) {
        this.numeroCuenta = nuevoNumeroCuenta;
    }

    /* Operaciones */
    public void depositar(double cantidad) {
        this.saldo += cantidad;
        System.out.println("Saldo actual: " + this.saldo);
    }

    public void retirar(double cantidad) {
        this.saldo -= cantidad;
        System.out.println("Saldo actual: " + this.saldo);
    }
}

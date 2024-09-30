
import clases.CuentaBancaria;
import clases.Persona;

public class Aplicacion {

    public static void main(String[] args) {
        /* La idea aqui es que comente un metodo y lo revise el otro :) */
        clasePersona();
        CuentaBancaria();

    }

    public static void clasePersona() {
        Persona persona1 = new Persona("Marco", 22);
        Persona persona2 = new Persona("Antonio", 23);
        Persona persona3 = new Persona("solis", 24);
        persona1.despliegaInformacion();
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        persona1.setNombre("Natanael");
        persona1.setEdad(24);
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
    }

    public static void CuentaBancaria() {
        CuentaBancaria cuenta1 = new CuentaBancaria(1.201, "Primero");
        CuentaBancaria cuenta2 = new CuentaBancaria(1.202, "Segundo");
        CuentaBancaria cuenta3 = new CuentaBancaria(1.203, "Tercero");
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
        System.out.println("Getter y Setter en el titular 2");
        cuenta2.setNumeroCuenta(22222222);
        cuenta2.setSaldo(111111);
        cuenta2.setTitular("Soy el nuevo titular 2");
        cuenta2.getNumeroCuenta();
        cuenta2.getSaldo();
        cuenta2.getTitular();
        System.out.println("-------Datos de la cuenta 3---------------------------");
        cuenta3.despliegaInformacion();
        System.out.println("-------Operaciones de la cuenta 3---------------------------");
        System.out.println("Deposito de 3000");
        cuenta3.depositar(3000);
        System.out.println("retiro de 2000");
        cuenta3.retirar(2000);
    }
}

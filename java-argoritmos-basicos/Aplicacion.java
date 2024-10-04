import clases.Algoritmos;

public class Aplicacion{

    public static void main(String[] args) {

        System.out.println("Es par");
        System.out.println(Algoritmos.esPar(11));

        System.out.println("Es primo");
        System.out.println(Algoritmos.esPrimo(1));

        System.out.println("String inverso");
        System.out.println(Algoritmos.stringEnReversa("natanael"));

        System.out.println("Palidromo");
        System.out.println(Algoritmos.esPalindromo("oso"));
        
        System.out.println("secuenciaFizzBuzz");
        System.out.println(Algoritmos.secuenciaFizzBuzz(15));

    }
}

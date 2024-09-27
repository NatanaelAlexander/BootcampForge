package clases;

public class Algoritmos {

    public static boolean esPar(int n) {
        return (n % 2 == 0);
    }

    public static boolean esPrimo(int n) {
        /* return n <= 1 ? false : (n % n == 0 && n % 1 == 0 && n % 3 != 0); */
        return n <= 1 ? false : ValidatorEsPrimo(n);
    }

    public static boolean ValidatorEsPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String stringEnReversa(String palabra) {
        String nuevaPalabra = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            nuevaPalabra += palabra.charAt(i);
        }
        return nuevaPalabra;
    }

    public static boolean esPalindromo(String palabra) {
        String nuevaPalabra = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            nuevaPalabra += palabra.charAt(i);
        }

        return nuevaPalabra.equals(palabra);
    }

    public static String secuenciaFizzBuzz(int n) {
        String fizzBuzz = "";
        for (int i = 1; i <= n; i++) {
            fizzBuzz += (i % 3 != 0 && i % 5 != 0) ? Integer.toString(i) : FizzBuzz(i);
            fizzBuzz += " ";
        }
        return fizzBuzz;
    }

    public static String FizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else {
            return "Buzz";
        }
    }

}

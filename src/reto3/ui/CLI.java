package reto3.ui;
import reto3.proceso.Conversor;

import java.util.Scanner;

/**
 * Clase que proporciona la interfaz de usuario para el programa de conversiones entre bases numéricas.
 */
public class CLI {

    private static Scanner scanner = new Scanner(System.in);

    public static void showmenu() {
        boolean continuar = true;
        while (continuar) {
            int opcion = mostrarMenu();
            int numero;
            String resultado;
            switch (opcion) {
                case 1:
                    numero = solicitarNumero("decimal");
                    resultado = Conversor.decimalToBinary(numero);
                    mostrarResultado("binario", resultado);
                    break;
                case 2:
                    numero = solicitarNumero("decimal");
                    resultado = Conversor.decimalToOctal(numero);
                    mostrarResultado("octal", resultado);
                    break;
                case 3:
                    numero = solicitarNumero("decimal");
                    resultado = Conversor.decimalToHexadecimal(numero);
                    mostrarResultado("hexadecimal", resultado);
                    break;
                case 4:
                    String binario = String.valueOf(solicitarNumero("binario"));
                    numero = Conversor.binaryToDecimal(binario);
                    mostrarResultado("decimal", numero);
                    break;
                case 5:
                    String octal = String.valueOf(solicitarNumero("octal"));
                    numero = Conversor.octalToDecimal(octal);
                    mostrarResultado("decimal", numero);
                    break;
                case 6:
                    String hexadecimal = String.valueOf(solicitarNumero("hexadecimal"));
                    numero = Conversor.hexadecimalToDecimal(hexadecimal);
                    mostrarResultado("decimal", numero);
                    break;
                case 7:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
                    break;
            }
        }
    }

    /**
     * Muestra el menú de conversiones y solicita al usuario que elija una opción.
     * @return la opción elegida por el usuario.
     */
    private static int mostrarMenu() {
        System.out.println("Menú de conversiones:");
        System.out.println("1. Convertir de decimal a binario");
        System.out.println("2. Convertir de decimal a octal");
        System.out.println("3. Convertir de decimal a hexadecimal");
        System.out.println("4. Convertir de binario a decimal");
        System.out.println("5. Convertir de octal a decimal");
        System.out.println("6. Convertir de hexadecimal a decimal");
        System.out.println("7. Salir");
        System.out.print("Elige una opción: ");
        return scanner.nextInt();
    }

    /**
     * Solicita al usuario que introduzca un número en la base especificada.
     * @param base la base del número a introducir.
     * @return el número introducido por el usuario.
     */
    private static int solicitarNumero(String base) {
        System.out.print("Introduce un número en base " + base + ": ");
        return scanner.nextInt();
    }

    /**
     * Muestra el resultado de la conversión al usuario.
     * @param base la base del número convertido.
     * @param resultado el número convertido.
     */
    private static void mostrarResultado(String base, String resultado) {
        System.out.println("El número en base " + base + " es: " + resultado);
    }

    /**
     * Muestra el resultado de la conversión al usuario.
     * @param resultado el número convertido.
     */
    private static void mostrarResultado(String base, int resultado) {
        System.out.println("El número en base " + base + " es: " + resultado);
    }
}

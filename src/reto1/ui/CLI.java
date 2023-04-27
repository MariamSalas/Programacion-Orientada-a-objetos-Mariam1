package reto1.ui;
import reto1.process.Calculator;

import java.util.Scanner;

/**
 * Clase para la interfaz de usuario del programa de operaciones matemáticas.
 */
public class CLI {
    /**
     * Método principal para ejecutar el programa de operaciones matemáticas.
     *Argumentos de línea de comandos (no se utilizan en este programa).
     */
    public static void showmenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al programa de operaciones matemáticas.");
        System.out.println("Por favor, elija una opción:");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División");
        int opcion = scanner.nextInt();
        double resultado = 0;
        switch(opcion) {
            case 1:
                System.out.println("Has elegido la opción de suma.");
                System.out.println("Por favor, introduce el primer número:");
                double a = scanner.nextDouble();
                System.out.println("Por favor, introduce el segundo número:");
                double b = scanner.nextDouble();
                resultado = Calculator.suma(a, b);
                System.out.println(a + " + " + b + " = " + resultado);
                break;
            case 2:
                System.out.println("Has elegido la opción de resta.");
                System.out.println("Por favor, introduce el primer número:");
                a = scanner.nextDouble();
                System.out.println("Por favor, introduce el segundo número:");
                b = scanner.nextDouble();
                resultado = Calculator.resta(a, b);
                System.out.println(a + " - " + b + " = " + resultado);
                break;
            case 3:
                System.out.println("Has elegido la opción de multiplicación.");
                System.out.println("Por favor, introduce el primer número:");
                a = scanner.nextDouble();
                System.out.println("Por favor, introduce el segundo número:");
                b = scanner.nextDouble();
                resultado = Calculator.multiplicacion(a, b);
                System.out.println(a + " x " + b + " = " + resultado);
                break;
            case 4:
                System.out.println("Has elegido la opción de división.");
                System.out.println("Por favor, introduce el primer número:");
                a = scanner.nextDouble();
                System.out.println("Por favor, introduce el segundo número:");
                b = scanner.nextDouble();
                resultado = Calculator.division(a, b);
                System.out.println(a + " / " + b + " = " + resultado);
                break;
            default:
                System.out.println("Opción no válida. El programa se cerrará.");
                break;
        }
        scanner.close();
    }


}
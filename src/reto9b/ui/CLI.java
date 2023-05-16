package reto9b.ui;
import reto9b.process.Pelota;

import java.util.Scanner;
/**
 * La clase UI proporciona una interfaz simple para interactuar con la clase Proceso.
 */
public class CLI {

    private static Scanner scanner = new Scanner(System.in);

    public static void main() {
        System.out.println("Bienvenido al programa de procesos!");

        System.out.print("Ingrese el color del proceso: ");
        String color = scanner.nextLine();

        Pelota proceso = new Pelota(color);

        int opcion = 0;
        while (opcion != 3) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Disminuir rapidez");
            System.out.println("2. Aumentar poder");
            System.out.println("3. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    proceso.disminuirRapidez();
                    System.out.println("Rapidez disminuida!");
                    System.out.println("La rapidez actual es: " + proceso.getRapidez());
                    break;
                case 2:
                    proceso.aumentarPoder();
                    System.out.println("Poder aumentado!");
                    System.out.println("El poder actual es: " + proceso.getPoder());
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}

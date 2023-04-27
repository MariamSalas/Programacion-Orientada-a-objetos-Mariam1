package reto4.ui;
import reto4.process.EstadisticasCafeFrio;

import java.util.Scanner;

/**
 * Clase encargada de la interfaz de usuario.
 */
public class CLI {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * Método principal de la clase CafeFrioUI.
     * Realiza la interacción con el usuario y llama a los métodos correspondiente
     **/

    public static void showmenu() {
        EstadisticasCafeFrio estadisticas = new EstadisticasCafeFrio();
        boolean seguir = true;
        while (seguir) {
            System.out.println("Bienvenido al sistema de estadísticas de café frío.");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ver trimestre que más se vende de un sabor de café frío.");
            System.out.println("2. Ver trimestre que más producto se vende en general.");
            System.out.println("3. Salir.");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el sabor de café frío que desea consultar (Chocolate, Vainilla, Fresa, Oreo):");
                    String sabor = scanner.nextLine();
                    try {
                        System.out.println(estadisticas.trimestreMasVendido(sabor));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Sabor de café frío inválido.");
                    }
                    break;
                case 2:
                    System.out.println(estadisticas.trimestreMasVendidoEnGeneral());
                    break;
                case 3:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            System.out.println();
        }
    }
}


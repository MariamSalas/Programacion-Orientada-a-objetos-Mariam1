package reto2.ui;
import reto2.process.Piramide;

import java.util.Scanner;

/**
 * Esta clase es responsable de la interfaz de usuario.
 */
public class CLI {
    /**
     * Método principal para la interfaz de usuario.
     * Pide al usuario que ingrese el tamaño de la pirámide y llama al método para construir la pirámide.
     * Argumentos de la línea de comandos.
     */
    public static void showmenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la pirámide: ");
        int size = scanner.nextInt();
        scanner.close();

        Piramide.buildPyramid(size);

    }





}
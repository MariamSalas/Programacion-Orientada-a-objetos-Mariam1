package reto2.process;
/**
 * Esta clase es responsable del procesamiento de los datos.
 */
public class Piramide {
    /**
     * Este método construye una pirámide de asteriscos.
     * @param size Tamaño de la pirámide.
     */
    public static void buildPyramid(int size) {
        if (size < 3) {
            throw new IllegalArgumentException("El tamaño de la pirámide debe ser mayor o igual a 3.");
        }

        int spaces = size - 1;
        int asterisks = 1;

        for (int i = 0; i < size; i++) {
            printSpaces(spaces);
            printAsterisks(asterisks);
            System.out.println();
            spaces--;
            asterisks += 2;
        }
    }

    /**
     * Este método imprime un número determinado de espacios en la consola.
     * @param count Número de espacios a imprimir.
     */
    private static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    /**
     * Este método imprime un número determinado de asteriscos en la consola.
     * @param count Número de asteriscos a imprimir.
     */
    private static void printAsterisks(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
    }
}
